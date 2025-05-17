package otherConceptJava;

public class staticExample {

    static int value=1;
    int value1=1;

    staticExample() {

        m1();
        m2();
    }
    void m1() {
        System.out.println(value);
        System.out.println(value1);
        System.out.println("Instance method");
        m2();

    }
    static void m2() {

        System.out.println(value);
        System.out.println("Static method");
        //System.out.println(value1); //Non-static field 'value1' cannot be referenced from a static context
        //m1();  //will not work (Non-static method 'm1()' cannot be referenced from a static context)


    }

    public static void main(String[] args) {
        new staticExample();

    }
}
