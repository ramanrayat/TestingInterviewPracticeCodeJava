public class find_peak_element {
    public static void main(String[] args) {
        int[] arr ={4,78,1,90,232,34,66,453,333,321,786,999,923};
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                System.out.println(arr[i]);
            }
        }
    }
}
