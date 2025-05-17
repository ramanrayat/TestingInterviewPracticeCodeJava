public class missing_number {
    public static void main(String[] args) {
        int arr[]= {1,2,3,5,6,7};
        int n=arr.length+1;
        int arr_sum=0;
        int sum = n*(n+1)/2;
        for(int i=0;i<arr.length;i++){
            arr_sum = arr_sum+arr[i];
        }
        int missing_number = sum-arr_sum;
        System.out.println("Missing number is :"+missing_number);

    }
}
