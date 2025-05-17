import java.util.*;
import java.util.stream.Collectors;

public class filterInJava {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();

        hm.put(11, "Apple");
        hm.put(22, "Orange");
        hm.put(33, "Kiwi");
        hm.put(44, "Banana");

        Map<Integer,String> result = hm.entrySet().stream().filter(map->map.getValue()=="Apple")
                .collect(Collectors.toMap(map->map.getKey(),map->map.getValue()));
        System.out.println(result);





    }

}
