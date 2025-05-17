import java.util.HashMap;

public class occurence_of_char {

    public static void main(String[] args) {
        String s1 = "ramanrayat";
        char[] arr = s1.toCharArray();
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for(Character ch: arr){
            if(!hm.containsKey(ch)){
                hm.put(ch,1);
            }else {
                hm.put(ch,hm.get(ch)+1);
            }
         }
        System.out.println(hm);
        //hm.forEach((a,b)-> {if(a=='r') System.out.println(a+">>>>>>>"+b);});

        //second way
        //        for(Character ch1: hm.keySet()){
        //            System.out.print(ch1.toString());
        //            System.out.print(hm.get(ch1));
        //        }

    }
}
