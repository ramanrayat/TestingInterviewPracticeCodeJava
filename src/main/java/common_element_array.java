import java.util.HashSet;
import java.util.Set;

public class common_element_array {
    public static void main(String[] args) {

        int arr1[] = {2,1,5,4,9};
        int arr2[] = {1,3,7,5,9};

        //Method 1
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> common = new HashSet<Integer>();
        for(Integer arr: arr1){
            set1.add(arr);
        }
        for(Integer arr3:arr2){
            if(set1.contains(arr3)){
                common.add(arr3);
            }
        }
        System.out.println(common);
    }
}
