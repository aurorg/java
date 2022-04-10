import java.util.Scanner;//特定导入
//可以用*代替Scanner，比如 import java.util.*  称为通配符导入
public class ComputeAreaWithConsoleInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);//创建一个对象，用来读取来自System.in的输入
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();
        double area = radius * radius * 3.14159;
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}
//+有两种含义：
// 第一种表示加法；
//第二种用于字符串的连接（合并）
