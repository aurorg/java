import java.util.ArrayList;
import java.util.Collection;

public class TestForEach {
    public static void main(String[] args){
        Collection<String> collection = new ArrayList<>();
        collection.add("abc");
        collection.add("def");
        collection.add("hij");

        collection.forEach(e-> System.out.print(e.toUpperCase() + ""));//使用lambda表达式，更加方便
    }
}
