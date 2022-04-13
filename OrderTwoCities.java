import java.util.Scanner;
public class OrderTwoCities {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first city:");
        String city1 = input.nextLine();
        System.out.print("Enter the second city:");
        String city2 = input.nextLine();

        if(city1.compareTo(city2) < 0)  // s.compareTo(s1)返回一个大于0，等于0，小于0的整数，分别表示该字符串是否大于,等于，小于s1
            System.out.println("The cities in alphabetical order are " +
                    city1 + " " + city2);
        else
            System.out.println("The cities in alphabetical order are " +
                    city2 + " " + city1);

    }
}
