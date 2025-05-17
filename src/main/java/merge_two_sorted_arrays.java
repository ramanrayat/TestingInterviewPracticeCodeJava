import java.util.Map;
import java.util.TreeMap;

public class merge_two_sorted_arrays {
    public static void main(String[] args) {
        int arr[] = {1,3,6,8};
        int arr1[] = {2,4,5,7};

        Map<Integer,Boolean> map = new TreeMap<Integer,Boolean>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],true);
        }
        for(int i=0;i<arr1.length;i++){
            map.put(arr1[i],true);
        }
        map.forEach((key,value)->{
            System.out.print(key);
        });
    }
}
