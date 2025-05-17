public class reverse_each_word_of_string {
    public static void main(String[] args) {

        String value = "hello how are you";
        String arr[] = value.split(" ");
        for(int i=0;i<arr.length;i++){
            for(int j=arr[i].length()-1;j>=0;j--){
                System.out.print(arr[i].charAt(j));
            }
            System.out.print(" ");
        }
    }
}
