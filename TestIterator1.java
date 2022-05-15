import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestIterator1 {
    public static void main(String[] args){
        Collection<String> collection = new ArrayList<>();//创建一个具体的集合对象
        collection.add("New York");
        collection.add("Atlanta");
        collection.add("Dallas");
        collection.add("Madison");

        Iterator<String>  iterator = collection.iterator();//获得集合的一个迭代器
        while (iterator.hasNext()){ //使用迭代器来遍历
            System.out.print(iterator.next().toUpperCase() + " ");//大写
        }
        System.out.println();
    }

}
