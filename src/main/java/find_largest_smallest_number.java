public class find_largest_smallest_number {
    public static void main(String[] args) {

        int arr[] = {23,2,3,83,67,12,9};
        int max=arr[0];
        int min=arr[0];
        for(int num: arr){
            if(num<min){
                min=num;
            }
            if(num>max){
                max=num;
            }
        }
        System.out.println("Min="+min+" & "+"Max="+max);

    }
}
