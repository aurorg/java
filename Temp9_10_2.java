public class Temp9_10_2 {
    public static void main(String[] args){
        Circlee circlee1 = new Circlee(1);
        Circlee circlee2 = new Circlee(2);

        swap1(circlee1,circlee2);
        System.out.println("After swap1 : circlee1 = "+
                circlee1.radius +" circlee2 = " + circlee2.radius);

        swap2(circlee1,circlee2);
        System.out.println("After swap2: circlee1 ="
                + circlee1.radius + " circlee2 = " + circlee2.radius);

    }
    public static void swap1(Circlee x,Circlee y){ //传递基本类型参数的方法，所以swap1的交换不起作用(传值)
        Circlee temp =x;
        x = y;
        y = temp;
    }
    public static void swap2(Circlee x,Circlee y){
        double temp = x.radius; //对象的数据和方法可以使用点操作符（.）通过其引用变量进行访问；就是引用数据的数据域（传地址）
        x.radius = y.radius;
        y.radius = temp;
    }
}
class Circlee {
    double radius;

    Circlee (double newRadius){
        radius = newRadius;
    }
}

