import org.w3c.dom.ls.LSOutput;

public class rotate_integer_array {
    public static void main(String[] args) {
        int arr[] = {3,4,1,6,9,8};
        int[] arr1;
        arr1 = new int[arr.length];
        int rot = 2,count=0;
        for(int i=0;i<=arr.length-1;i++){

            if(i<arr.length-rot){
                arr1[i]=arr[i+rot];
            }else {
                arr1[i]=arr[count];
                count++;
            }
        }

        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }

        }
    }
