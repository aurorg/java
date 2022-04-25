public class TestOverloading {
    public static void main(String[] args){
        AAA a = new AAA();
        a.p(10);
        a.p(10.0);
    }
}

class BBB {
    public void p(double i){
        System.out.println(i*2);
    }
}

class AAA extends BBB{
    public void p(int i){
        System.out.println(i);
    }
}
