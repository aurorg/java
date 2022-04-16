public class TestArrayArguments {
    public static void main(String[] args){
        int x =1;
        int[] y =new int[10];
        m(x,y);
        System.out.println("x is " + x);
        System.out.println("y[0] is " + y[0]);
    }

    public static void m(int number , int[] numbers){
        number =1001; //(x)
        numbers[0] =5555;/*尽管y和numbers是两个独立的变量，但他们指向同一个数组；
                           y中包含数组的引用值，所以numbers现在包含的是指向同一个数组的相同引用值*/
    }
}
