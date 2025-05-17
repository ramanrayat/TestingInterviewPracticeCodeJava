import java.util.HashMap;

public class print_unique_element {

    public static void main(String[] args) {

        int arr[] = {1,2,5,3,3,1,7,7};
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();

        for(int val:arr){
            if(!hm.containsKey(val)){
                hm.put(val,1);
            }else{
                hm.put(val,hm.get(val)+1);
            }
        }
        hm.forEach((key,value)-> {
            if(value==1){
                System.out.println(key);
            }
        });

    }
}
