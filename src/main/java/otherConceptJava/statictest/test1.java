package otherConceptJava.statictest;

public class test1 {

    private int x = 10;
//    private static int z1 = 10; //3
//    private static int z2 = 10; //3
//    private static int z3 = 10; //3


    static int m1(){

        //int y = x; it will not work   #1

//        test1 obj = new test1();   //2
//        int y = obj.x;             //2

        return 0;
    }

    //3
//    static void m2(){
//        z1= 20;
//    }
//
//    test1(){
//        z2=20;
//    }
//
//    static {
//        z3=20;
//    }

    public static void main(String[] args) {
        //m1();   //1

        //System.out.println(m1());   //2


        //3
//        test1 t1 = new test1();
//        System.out.println("z1:"+z1);
//        System.out.println("z2:"+z2);
//        System.out.println("z3:"+z3);



    }


}
