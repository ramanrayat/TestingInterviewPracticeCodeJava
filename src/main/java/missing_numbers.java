public class missing_numbers {

    public static void main(String[] args) {

        int arr[] = {2,7,34};
        boolean flag=false;
        for(int i=arr[0];i<arr[arr.length-1];i++){
            for(int j=0;j<arr.length;j++){
                if(i==arr[j]){
                    flag=true;
                    break;
                }else{
                    flag=false;
                }
            }
            if(!flag){
                System.out.println(i);
            }
        }
    }
}
