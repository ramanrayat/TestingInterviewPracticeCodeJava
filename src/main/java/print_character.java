import java.util.HashMap;

public class print_character {
    public static void main(String[] args) {
        int a=2;
        int b=5;

        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        hm.put('a',2);
        hm.put('b',5);

        System.out.println(hm);
        hm.forEach((key,value)-> {
            for(int i=0;i<value;i++){
                System.out.print(key);
            }});

    }
}
