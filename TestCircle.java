public class  TestCircle {  //主类，用来测试第二个Circle类
    public static void main(String[] args){
        //创建第一个对象，使用new操作符从构造方法创建一个对象： 创建一个半径为1的对象
        Circle circle1 = new Circle(); //circle属于Circle类型
        System.out.println("The area of the circle of radius "
         + circle1.radius + " is " +circle1.getArea()); //circle1.getArea()表示调用circle1的getArea方法

        Circle circle2 = new Circle(25); //创建第二个对象
        System.out.println("The area of the circle of radius "
                + circle2.radius + " is " +circle2.getArea());

        Circle circle3 = new Circle(125);  //创建第三个对象
        System.out.println("The area of the circle of radius "
                + circle3.radius + " is " + circle3.getArea());

        circle2.radius = 100;
        System.out.println("The area of the circle of radius "
                + circle2.radius + " is " +circle2.getArea());
  }
}

class Circle1 {  //构建一个类
    double radius;  //数据域

    //25-31是构造方法
    Circle1() {   //无参构造方法
        radius = 1;
    }

    Circle1(double newRadius){
        radius = newRadius;
    }

    //下面都是方法
    double getArea(){
        return radius *radius * Math.PI;
    }

    double getPerimeter(){
      return 2 *radius *Math.PI;
    }

    void setRadius(double newRadius){
        radius = newRadius;
    }
}
