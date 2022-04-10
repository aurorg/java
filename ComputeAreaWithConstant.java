import java.util.Scanner;

public class ComputeAreaWithConstant {
    public static void main(String[] args){
        final double PI = 3.14159; //final 相当于c语言的宏定义

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();

        double area = radius * radius *PI;
        System.out.println("The area for the cricle of radius " + radius + " is " + area );

    }

}
