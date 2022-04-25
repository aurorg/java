public class TestCircleRectangle {
    public static void main(String[] args){
        Circle circle = new Circle(1);
        System.out.println("A circle "+ circle.toString());
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is" + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        Rectangle rectangle = new Rectangle(2,4);
        System.out.println("\nA rectangle " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());
    }

}

class GeometricObject{  //父类
    private String color = "write";   //私有数据域color 和 filled 不能被除了父类本身之外的其他任何类访问
    private boolean filled;           //读取和改变color与filled的唯一方法就是通过它们的获取方法和设置方法
    private java.util.Date dateCreated;  //对象创建的日期

    public GeometricObject(){     //创建一个GeometricObject
        dateCreated = new java.util.Date();
    }

    public GeometricObject(String color,boolean filled){  //创建一个带特殊颜色和填充物的GeometricObject
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return color; //返回颜色
    }

    public void setColor(String color){
        this.color = color;   //设置新的颜色
    }

    public boolean isFilled(){
        return filled;  //返回filled的属性（false  or  true）
    }

    public void setFilled(boolean filled){
        this.filled = filled;    //设置filled新的属性
    }

    public java.util.Date getDateCreated(){
        return dateCreated; //返回dateCreated
    }

    public String toString(){   //返回这个对象的字符串表述
        return "created on " + dateCreated + "\ncolor: " + color + "and filled: " + filled;
    }
}


class Circle extends GeometricObject{  //子类
    private double radius;

    public Circle() {
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius,String color,boolean filled){
        this.radius = radius;
        setColor(color);  //直接调用父类的
        setFilled(filled);
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return radius *radius *Math.PI;
    }

    public double getDiameter(){
        return 2*radius;
    }

    public double getPerimeter(){
        return 2*radius *Math.PI;
    }

    public void printCircle(){
        System.out.println("The circle is created " +getDateCreated() +
                            " and the radius is " + radius);
    }
}


class Rectangle extends GeometricObject{  //子类
    private double width;
    private double height;

    public Rectangle(){

    }

    public Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width,double height,String color,boolean filled){
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return 2 * (width + height);
    }
}


