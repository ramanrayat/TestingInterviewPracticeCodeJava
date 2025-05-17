import java.util.*;

public class hashmap_remove_second_high {
    public static void main(String[] args) {

        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        hm.put('a',20);
        hm.put('b',10);
        hm.put('c',60);
        hm.put('d',50);
        hm.put('e',30);
        System.out.println(hm);
        List<Integer> values = new ArrayList<>(hm.values());
        Collections.sort(values);

        int secondHigh = values.get(values.size()-2);
        hm.values().removeIf(value -> value == secondHigh);
        System.out.println(hm);

    }
}
