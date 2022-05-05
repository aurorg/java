import java.util.ArrayList;
import java.math.*;
public class LargestNumber {
    public static void main(String[] args){
        ArrayList<Number> list = new ArrayList<>();//创建一个Number对象的ArrayList
        list.add(45);
        list.add(3445.53);
        list.add(new BigInteger("3333333333333"));
        list.add(new BigDecimal("1.2222222222222"));

        System.out.println("The largest number is " + getLargestNumber(list));
    }
    public static Number getLargestNumber(ArrayList<Number> list){
        if(list == null || list.size() == 0)
            return null;

        Number number = list.get(0);
        for(int i =0;i<list.size();i++)
            if(number.doubleValue()<list.get(i).doubleValue())
                number = list.get(i);

        return number;
    }
}
