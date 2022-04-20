public class TestCircleWithPrivateDataFields {
    public static void main(String[] args){
        Circle2 myCircle = new Circle2(5.0);

        myCircle.setRadius(myCircle.getRadius() * 1.1);
        System.out.println("The area of the circle of radius "
         + myCircle.getRadius() + " is " + myCircle.getArea());

        System.out.println("The number of objects created is "
        + Circle.getNumberOfObjects());
    }
}

class Circle2{
    private double radius = 1;  //radius被声明为私有的，私有数据只能在定义它们的类中访问，因此不能使用myCircle.radius来访问

    private static int numberOfObjects = 0;  // 私有的。所以不能被修改  。  表示创建圆对象的个数

    public Circle2(){
        numberOfObjects++;
    }

    public Circle2(double newRadius){
        radius = newRadius;
        numberOfObjects++;
    }

    public double getRadius(){ //返回半径值
        return radius;
    }

    public void setRadius (double newRadius){  // 设置新的半径值
        radius = (newRadius >=0) ? newRadius : 0;
    }

    public static int getNumberOfObjects(){  //返回所创建的圆的对象的个数
        return numberOfObjects;
    }

    public double getArea(){    //返回圆的面积
        return radius * radius *Math.PI;
     }
    }

