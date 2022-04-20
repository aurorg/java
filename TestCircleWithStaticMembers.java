public class TestCircleWithStaticMembers {
    public static void main(String[] args){
        System.out.println("Before creating objects");
        System.out.println("The number of Circle objects is "
        +Circle.numberOfObjects); //静态变量和方法可以在不创建对象的情况下访问，
                                  //输出个数是0，因为还没有创建对象

        Circle c1 = new Circle();  //c1创建之后，静态变量numberOfObjects就变成1

        System.out.println("\nAfter creating c1");
        System.out.println("c1: radius (" +c1.radius +
                ") and number of Circle objects (" +
                c1.numberOfObjects + ")");

        Circle c2 = new Circle(5); //c2创建之后，静态变量numberOfObjects就变成2

        c1.radius = 9;// 相当于 Circle c1 =new Circle (9)

        System.out.println("\nAfter creating c2 and modifying c1");

        System.out.println("c1 : radius (" + c1.radius + ") and number of Circle objects ("
        + c1.numberOfObjects + ")");  //最好使用Circle .numberOfObjects 来代替 c1.numberOfObjects
                                      //因为使用“类名.方法名（参数）”的方式调用静态方法
                                      //    使用“类名.静态变量”的方式访问静态变量      ，更容易阅读

        System.out.println("c2 : radius (" + c2.radius + ") and number of Circle objects ("
        + c2.numberOfObjects + ")");
        //静态方法和静态数据可以通过引用变量或他们的类名来访问

    }
}
class Circle {
    double radius;  //实例变量

    static int numberOfObjects = 0; //静态变量,用来统计创建的Circle对象的数目

    Circle(){
        radius =1;
        numberOfObjects++;
    }
    Circle(double newRadius){
        radius = newRadius ;
        numberOfObjects++;
    }

    static int getNumberOfObjects(){ //静态方法，前面有static的称为静态方法。Math类中的所有方法都是静态的，main也是静态方法
        return numberOfObjects;
    }

    double getArea(){  //实例方法  ； 在实例创建之后才能使用，通过引用变量来访问
        return radius*radius*Math.PI;
    }
}
