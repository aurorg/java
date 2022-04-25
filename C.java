class AA{
    public AA() {
        System.out.println("AA's no-arg constructor is invoked");
    }
}

class B extends AA {
}

public class C {
    public static void main(String[] args){
        B b = new B();
    }
}