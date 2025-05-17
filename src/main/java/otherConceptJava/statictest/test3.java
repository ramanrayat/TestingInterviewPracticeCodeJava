package otherConceptJava.statictest;

class demo {

    static{
        System.out.println("hello");
    }
    public static final int i =10;
}
public class test3 {
    public static void main(String[] args) {
        System.out.println(demo.i);
    }
}
