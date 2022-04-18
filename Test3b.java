public class Test3b {    //一个方法向另一个方法里面传数据，不能传值，要传地址
    public static void main(String[] args) {
        int[] a = {1, 2};
        swap(a);
        System.out.println("a[0] = " + a[0] + " a[1] = " + a[1]);
    }

    public static void swap(int[] a){
        int temp =a[0];
        a[0] = a[1];
        a[1] = temp;
    }
}