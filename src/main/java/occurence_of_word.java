import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class occurence_of_word {

    public static void main(String[] args) {
        String s1 = "hare krishn hare krishn krishn krishn hare hare. hare ram hare ram ram ram hare hare";
        String s2 = s1.replace(".","");
        String arr[]=s2.split(" ");

        Map<String,Integer> hm = new HashMap<String,Integer>();
        for(String val: arr){
            if(hm.containsKey(val)){
                hm.put(val,hm.get(val)+1);
            }else{
                hm.put(val,1);
            }
        }
//        hm.forEach((a,b)-> {if(a.equals("ram")) System.out.println(a+""+b);}); //for specific key
        System.out.println(hm);

        Map<String,Integer> result = hm.entrySet().stream().filter(map->map.getKey().equalsIgnoreCase("ram"))
                .collect(Collectors.toMap(map->map.getKey(),map->map.getValue()));
        System.out.println(result);



    }
}
