import java.math.*;
public class SortComparableObjects {
    public static void main(String[] args){
        String[] cities = {"Savannah","Boston","Atlanta","Tampa"};//创建一个字符串数组
        java.util.Arrays.sort(cities);//调用sort方法对字符串数组排序
        for(String city: cities)
            System.out.print(city + " ");
        System.out.println();

        BigInteger[] hugeNumbers = {
                new BigInteger("12345678"),
                new BigInteger("123456789"),
                new BigInteger("123456789000")};
        java.util.Arrays.sort(hugeNumbers);
        for (BigInteger number:hugeNumbers)
            System.out.print(number + " ");
    }

}
