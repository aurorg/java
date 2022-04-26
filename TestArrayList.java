import java.util.ArrayList;//因为ArrayList位于java.util包中，在第一行导入该包

public class TestArrayList {
    public static void main(String[] args){
        //采用无参构造方法创建一个存储字符串的ArrayList,并且将引用赋值给cityList
        ArrayList<String> cityList = new ArrayList<>();

        //使用add方法将字符串添加到数组末尾
        cityList.add("London");
        cityList.add("Denver");
        cityList.add("Paris");
        cityList.add("Miami");
        cityList.add("Seoul");
        cityList.add("Tokyo");

        //调用size（ ）方法返回这个数组列表的大小
        System.out.println("List size?" + cityList.size());

        //调用contains("Miami")检查该对象是否在这个数组列表中【返回true或者false】
        System.out.println("Is Miami in the list? " + cityList.contains("Miami"));

        //调用indexOf("Denver")返回该对象在数组列表的下标值
        System.out.println("The location of Denver in the list? " +cityList.indexOf("Denver"));

        //检查该数组列表是否是空的
        System.out.println("Is the list empty? " +cityList.isEmpty());

        //在数组列表的制定下标位置插入一个对象
        cityList.add(2,"Xian");

        //从数组列表中删除对象“Miami”
        cityList.remove("Miami");

        //删除数组列表制定下标的元素
        cityList.remove(1);

        //这条语句等价于System.out.print\n(cityList)
        //方法toString( )返回数组列表的字符串表示，其形式为【x1,x2,...,xn】;比如[London, Xian, Paris, Seoul, Tokyo]
        System.out.println(cityList.toString());

        for(int i=cityList.size()-1;i>=0;i--)
            System.out.print(cityList.get(i) + " ");//get(index)返回制定下标位置处的对象
        System.out.println();

        ArrayList<Circle> list = new ArrayList<>();

        list.add(new Circle(2));
        list.add(new Circle(3));

        System.out.println("The area of the circle? " + list.get(0).getArea());
    }

}
