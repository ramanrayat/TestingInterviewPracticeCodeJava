package otherConceptJava.statictest;

public class student {

    public static int count =0;

    static {
        System.out.println("hello");
    }

    static {
        System.out.println("world");
    }

    public student(){
        count++;
    }

    public static void getCount(){
        System.out.println(count);
    }

    private int id;
    private String name;
    private int age;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
