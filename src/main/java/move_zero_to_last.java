public class move_zero_to_last {
    public static void main(String[] args) {
        int arr[]={1,3,0,2,0,6,7,0,4};
        int index=0;
        int arr1[]= new int[arr.length];


        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr1[index] =arr[i];
                index++;
            }
        }
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]);
        }

    }
}
