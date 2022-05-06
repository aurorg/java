public class TestRationalClass {
    public static void main(String[] args){
        Rational r1 = new Rational(4,2);
        Rational r2 = new Rational(2,3);
        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println(r2 + " is " + r2.doubleValue());
    }
}

class Rational extends Number implements Comparable<Rational>{
    private long numerator = 0; //有理数的分子
    private long denominator = 1;//有理数的分母

    public Rational(){ //使用分子0 和 分母1 创建一个有理数
        this(0,1);
    }

    public Rational(long numerator,long denominator){  //使用给定的分子和分母创建一个有理数
        long gcd = gcd(numerator,denominator);
        this.numerator = (denominator>0 ?1:-1)*numerator /gcd;
        this.denominator =Math.abs(denominator) /gcd;
    }

    private static long gcd(long n,long d){ //返回除数n和d的最大公约数
        long n1 = Math.abs(n);
        long n2 = Math.abs(d);
        int gcd =1;

        for(int k=1;k<=n1 && k<=n2;k++){
            if(n1 % k ==0 && n2 %k ==0)
                gcd =k;
        }
        return gcd;
    }

    public long getNumerator(){  //返回有理数的分子
        return numerator;
    }

    public long getDenominator(){ //返回有理数的分母
        return denominator;
    }

    public Rational add(Rational secondRational) {  //返回该有理数和另外一个有理数相加的和
        long n = numerator * secondRational.getDenominator() +
                denominator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Rational(n, d);
    }

    public Rational subtract(Rational secondRational){//返回该有理数和另外一个有理数相加的差
        long n = numerator *secondRational.getDenominator() -
                denominator * secondRational.getNumerator();
        long d = denominator *secondRational.getDenominator();
        return new Rational(n,d);
    }

    public Rational multiply(Rational secondRational){//返回该有理数和另外一个有理数相加的积
        long n = numerator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Rational(n,d);
    }

    public Rational divide(Rational secondRational){//返回该有理数和另外一个有理数相加的商
        long n = numerator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Rational(n,d);
    }

    @Override
    public String toString(){  //返回形式为 “分子/分母”的字符串
        if(denominator ==1)
            return numerator + "";//转换为字符串
        else
            return numerator + "/" + denominator;
    }

    @Override
    public boolean equals(Object other){
        if((this.subtract((Rational)(other))).getNumerator()==0)
            return true;
        else
            return false;
    }

    @Override
    public int intValue(){
        return (int)doubleValue();
    }

    @Override
    public float floatValue(){
        return (float)doubleValue();
    }

    @Override
    public double doubleValue(){
        return numerator *1.0/denominator;
    }

    @Override
    public long longValue(){
        return (long)doubleValue();
    }

    @Override
    public int compareTo(Rational o){
        if(this.subtract(o).getNumerator() >0)
            return 1;
        else if (this.subtract(o).getNumerator() <0)
            return -1;
        else
            return 0;
    }
}


















