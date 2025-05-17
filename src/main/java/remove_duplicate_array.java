import java.util.HashSet;
import java.util.Set;

public class remove_duplicate_array {
    public static void main(String[] args) {
        int arr[] = {1,4,2,7,2,9,9};
        Set<Integer> set = new HashSet<Integer>();
        for(int val: arr){
            set.add(val);
        }
        System.out.println(set);
    }
}
