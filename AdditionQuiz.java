import java.util.Scanner;
public class AdditionQuiz {
    public static void main(String[] args){
        //产生随机数的方法之一，程序随机产生两个只有一位数的number1 和 number2
        int number1 = (int)(System.currentTimeMillis() % 10); //（当前时间的最后一位数字）产生第一个数字
        int number2 = (int)(System.currentTimeMillis() / 10 % 10); //（当前时间的倒是第二位数字）产生第二个数字

        Scanner input =new Scanner(System.in);

        System.out.print(
                "What is" + number1 + " + " + number2 + " ? ");
        int answer = input.nextInt();

        System.out.println(
                number1 + " + " + number2 + " = " + answer + " is " +(number1 +number2 ==answer));// number1 + number2 == answer是布尔表达式

    }
}
