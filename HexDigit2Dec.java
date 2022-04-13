import java.util.Scanner;
public class HexDigit2Dec {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        String hexString = input.nextLine();

        if(hexString.length() !=1){
            System.out.println("You must enter exactly one character");
            System.exit(1); //直接退出程序
        }
        char ch = Character.toUpperCase(hexString.charAt(0));
        if ('A' <= ch && ch <= 'F'){
            int value = ch - 'A' + 10;
            System.out.println("The decimal value for hex digit" + ch + " is " + value);
        }
        //isDigit(ch)如果指定的是数字，返回true
        else if(Character.isDigit(ch)){ //调用Character.isDigit(ch)来检测ch是否在0-9之间
            System.out.println("The decimal value for hex digit " + ch + " is " +ch);
        }
        else{
            System.out.println(ch + " is an invalid input");
        }

    }
}
