public class stringTest {
    public static void main(String[] args) {
        StringBuffer s7 = new StringBuffer("raman");
        String s1 = "raman";
        String s2 = "stringTest";
        String s5 = s1.concat(s2);
        String s3 = "ramantest";
        String s4 = "RAMAN";
        System.out.println(s3.equals(s5)); //true
        System.out.println(s1.equals(s7.toString())); //true
        System.out.println(s1.equals(s4)); //false

    }
}


//

