public class find_pair_of_sum_is_target {
    public static void main(String[] args) {
        int target =7;
        int arr[] = {1,4,2,6,0,7,3};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(arr[i]+""+arr[j]);
                }
            }
        }
    }
}
