public class TestPassObject {
    public static void main(String[] args){
        Circle3 myCircle3 =new Circle3(1);
        int n =5;  //n的值传给了 times，printAreas中times的值被改变，但不会影响n的值（传递基本数据类型参数时，传递的是实参的值）
        printAreas(myCircle3,n); //把myCircle3对象作为参数传递给printArea方法； 这个值就是一个对myCircle对象的引用值
                                 //myCircle3的引用被传递给printAreas方法中的c；
                                 //传递引用类型参数时，传递的是对象的引用
        System.out.println("\n" + "Radius is " +myCircle3.getRadius());
        System.out.println("n is " + n);
    }

    public static void printAreas(Circle3 c,int times){
        System.out.println("Radius  \t\tArea");
        while (times >=1) {
            System.out.println(c.getRadius() + "\t\t" + c.getArea());
            c.setRadius(c.getRadius() + 1);
            times--;
        }
    }
}
class Circle3{
    private double radius = 1;  //radius被声明为私有的，私有数据只能在定义它们的类中访问

    private static int numberOfObjects = 0;  // 私有的。所以不能被修改

    public Circle3(){
        numberOfObjects++;
    }

    public Circle3(double newRadius){
        radius = newRadius;
        numberOfObjects++;
    }

    public double getRadius(){ //返回半径值
        return radius;
    }

    public void setRadius(double newRadius){  // 设置新的半径值
        radius = (newRadius >=0) ? newRadius : 0;
    }

    public static int getNumberOfObjects(){
        return numberOfObjects;
    }

    public double getArea(){
        return radius * radius *Math.PI;
    }
}
