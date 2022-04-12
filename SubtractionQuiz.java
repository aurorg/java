import java.util.Scanner;
public class SubtractionQuiz {
    public static void main(String[] args){
        //可以使用Math.random()来获得一个0.0到1.0之间的随机数double的值，不包括1.0
        //（int）(Math.random()*10)会返回一个双精度的随机的整数（0——9），不包括9
        int number1 = (int)(Math.random()*10);
        int number2 = (int)(Math.random()*10);

        if (number1 < number2 ){
            int temp=number1;
            number1 = number2;
            number2 = temp;
        }

        System.out.print
                ("What is " + number1 + " - " + number2 + " ? " );
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        if (number1 - number2 ==answer) {
            System.out.println("You are correct!");
        }
        else {
            System.out.println("Your answer is wrong.");
            System.out.println(number1 + " - " + number2 +
                    " should be " + (number1 - number2));
            }

    }

}
