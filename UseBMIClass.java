public class UseBMIClass {
    public static void main(String[] args){
        BMI bmi1 = new BMI("Xiao Ming", 18, 145, 70);
        System.out.println("The BMI for " + bmi1.getName()
                + " is " + bmi1.getBMI() + " " + bmi1.getStatus());

        BMI bmi2 = new BMI("King Ming", 215, 70);
        System.out.println("The BIM for " + bmi2.getName()
                + " is " +  bmi2.getBMI() + " " + bmi2.getStatus());
    }
}

class BMI{
    private String name;// *  名字
    private int age;// **   年龄
    private double weight;// ***  体重
    private double height;// **** 身高
    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double METERS_PER_INCH = 0.0254;

    public BMI(String name,int age,double weight,double height){  //创建一个带特定名字、年龄、体重、身高的BMI对象
        this.name = name;// *this关键词用于引用正在被构建的对象的数据域 name
        this.age = age;// **
        this.weight = weight;// ***
        this. height = height;// ****
    }

    public BMI(String name,double weight,double height){  //创建一个带特定名字、体重、身高并且默认年龄是20的BMI对象
        this(name, 20, weight, height);
    }

    public double getBMI(){  //用来返回BMI
        double bmi =weight *KILOGRAMS_PER_POUND /
                ((height *METERS_PER_INCH) * (height * METERS_PER_INCH));
        return Math.round(bmi*100) / 100.0;
    }

    public String getStatus(){  //用来返回BMI的状态，返回的是字符串
        double bmi = getBMI();
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getWeight(){
        return weight;
    }

    public double getHeight(){
        return height;
    }
}
