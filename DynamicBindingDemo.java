public class DynamicBindingDemo {
    public static void main(String[] args){
       //类Student、Person、Object都实现了toString( )方法，使用哪个实现取决于运行时x的实际类型
        m(new GraduateStudent()); // 调用 m(new GraduateStudent())时会导致定义在Student类中的toString方法被实现
        m(new Student());         // 调用 m(new Student())会调用在Student类中的toString( )方法被实现
        m(new Person());          // 调用 m(new Person())会调用在Person类中的toString( )方法实现
        m(new Object());          // 调用 m(new Object())会调用在Object类中的toString( )方法实现
    }
    public static void m(Object x){  //方法m有一个Object类型的参数，可以用任何对象作为参数来调用m方法
        System.out.println(x.toString());
    }
}

class GraduateStudent extends Student{

}

class Student extends Person{
    @Override
    public String toString(){
        return "Student";
    }
}

class Person extends Object{
    @Override
    public String toString(){
        return "Person";
    }
}
