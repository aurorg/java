import java.util.Scanner;
import java.math.*;
public class LargeFactorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        System.out.println(n + " ! is \n" + factorial(n));
    }

    public static BigInteger factorial(long n){
        BigInteger result = BigInteger.ONE;  //BigInteger.ONE是一个定义在BigInteger类中的常量
                                            //BigInteger.ONE 等价于  new BigInteger("1")
        for(int i =1;i<=n;i++)
            result = result.multiply(new BigInteger(i + ""));  //multiply(a,b)表示计算a*b
                                                                   //这里表示 result*i ;[i +""]表示字符串

        return result;
    }
}
