import java.util.Scanner;

public class TestLoanClass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);//用来从键盘读入利率，还贷周期，贷款额度

        System.out.print(
                "Enter annual interest rate,for example,8.25: "); //读取利率
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of years as an integer: ");//读取贷款年数
        int numberOfYears = input.nextInt();

        System.out.print("Enter loan amount,for example , 120000.95: "); //读取贷款额度
        double loanAmount = input.nextDouble();

        Loan loan = new Loan(annualInterestRate,numberOfYears,loanAmount);

        System.out.printf("The loan was create on %s\n" +
                "The monthly payment is %.2f\nThe total payment is %.2f\n",
                loan.getLoanDate().toString(),loan.getMonthlyPayment(),
                loan.getTotalPayment());
    }
}

class Loan{  //创建类

    //以下四个变量仅对本类可见
    private double annualInterestRate; //贷款年利率
    private int numberOfYears; //贷款年数
    private double loanAmount; //贷款额
    private java.util.Date loanDate; //贷款创建日期

    public Loan(){ //无参构造方法
        this(2.5,1,1000); //构建代指利率，贷款年数，贷款额度
    }

    public Loan(double annualInterestRate, int numberOfYears,double loanAmount){ //有参构造方法
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;   //返回贷款的年利率
    }

    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate; //设置贷款新的年利率
    }

    public int getNumberOfYears(){  //返回贷款的年数
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears){
        this.numberOfYears = numberOfYears; //设置贷款新的年数
    }

    public double getLoanAmount(){ //返回贷款的额数
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount){
        this.loanAmount = loanAmount; //设置新贷款的额度
    }

    public double getMonthlyPayment(){  //返回贷款的月支付额
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate /
                (1 - (1 / Math.pow(1 + monthlyInterestRate,numberOfYears * 12)));
        return monthlyPayment;
    }

    public double getTotalPayment(){ //返回贷款的总支付额
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }

    public java.util.Date getLoanDate(){
        return loanDate;
    }
}
