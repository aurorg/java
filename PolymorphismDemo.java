public class PolymorphismDemo {
    public static void main(String[] args){
        displayObject(new Circle(1,"red",false));
        displayObject(new Rectangle(1,1,"black",true));
    }

    //具有GeometricObject类型的参数，可以通过传递任何一个GeometricObject的实例（eg:3,4行的实例）
    public static void displayObject(GeometricObject object){
        System.out.println("Created on " + object.getDateCreated()+
                ".Color is " + object.getColor());
    }
}
