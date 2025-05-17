import java.util.HashMap;
import java.util.Map;

public class hashmapIterations {

    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<String,String>();
        hm.put("a","A");
        hm.put("b","B");
        hm.put("c","C");

        System.out.println(hm);
        hm.forEach((k,v)-> System.out.println(k+":"+v)); //from lambda

        for(Map.Entry<String,String> entry : hm.entrySet()){   //from entry set
            System.out.println(entry.getKey());
        }

        for(String s: hm.keySet()){    //from key set to print keys
            System.out.println(s);
        }

        for(String s: hm.values()){     //from values to print values
            System.out.println(s);
        }
    }





}
