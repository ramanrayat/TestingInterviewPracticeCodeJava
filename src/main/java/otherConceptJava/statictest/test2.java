package otherConceptJava.statictest;

public class test2 {

    static int a = 20;
    static {
        System.out.println("in static");
        a++;
    }
    {
        System.out.println("in brackets");
        a++;
        System.out.println(a);
    }

    public static void main(String[] args) {
        {
            test2 obj = new test2();
            test2 obj2 = new test2();
            test2 obj3 = new test2();
        }
    }

}
