public class CastingDemo {
    public static void main(String[] args){
        Object object1 = new Circle(1);//使用隐式转换将一个Circle对象赋值给object1
        Object object2 = new Rectangle(1,1);//使用隐式转换将一个Rectangle对象赋值给object2

        displayObject(object1);
        displayObject(object2);
    }

    public static void displayObject(Object object){
        if(object instanceof Circle){  //只有源对象是目标类的实例时才能进行类型转换，在执行前程序使用instanceof来确保源对象是否是目标类的实例
            System.out.println("The circle area is " +
                    ((Circle)object).getArea()); //将Object转化成Circle类型;因为.优先于类型转换操作符，所以使用圆括号保证在访问操作符.之前进行转换
            System.out.println("The circle diameter is " +
                    ((Circle)object).getDiameter());
        }
        else if (object instanceof Rectangle){
            System.out.println("The rectangle area is " +
                    ((Rectangle)object).getArea());
        }
    }
}
