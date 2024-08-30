package pkg1;

class C1 {
    void greet(){
        System.out.println("hello Kishan");
    }
}

class C2 extends C1 {
    @Override
    public void greet() {
       System.out.println("hello CS sir");
    }
}
public class S13 {
    public static void main(String[] args) {
        C1 c1 = new C1();
        c1.greet();
    }
}
