public class SortRectangles {
    public static void main(String[] args){
        ComparableRectangle[] rectangles = {
                new ComparableRectangle(3,4),
                new ComparableRectangle(30,40),
                new ComparableRectangle(300,400),
                new ComparableRectangle(3000,4000),};
        java.util.Arrays.sort(rectangles);
        for(Rectangle rectangle: rectangles){
            System.out.print(rectangles + " ");
            System.out.println();
        }
    }
}

class ComparableRectangle extends Rectangle
        implements Comparable<ComparableRectangle>{
    public ComparableRectangle(double width,double height){
        super(width,height);
    }

    @Override
    public int compareTo(ComparableRectangle o){
        if (getArea() >o.getArea())
            return 1;
        else if (getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

    @Override
    public String toString(){
        return "Width: " + getWidth() + "Height: " +getHeight() +"Area: " +getArea();
    }
}
