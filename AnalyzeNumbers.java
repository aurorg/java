public class AnalyzeNumbers {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int n = input.nextInt(); //n表示用户输入数组的大小
        double[] numbers = new double[n]; //创建一个数组
        double sum = 0;

        System.out.print("Enter the numbers : ");
        for (int i = 0; i<n; i++){
            numbers[i]=input.nextDouble(); //用for循环将数字记录到数组
            sum +=numbers[i];
        }

        double average = sum/n;

        int count = 0;
        for (int i=0;i<n;i++)
            if(numbers[i] > average)
                count++;

        System.out.println("Average is " + average);
        System.out.println("Number of elements above the average is " +count);
    }
}
