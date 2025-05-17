public class anagram_string {
    public static void main(String[] args) {
        String A = "catr";
        String B = "actr";

        if(sort(A).equals(sort(B))){
            System.out.println("String is anagram");
        }else{
            System.out.println("String is not an anagram..");
        }

    }

    public static String sort(String val){


        String newstr="";

        char arr[] = val.toCharArray();
        char temp = ' ';
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            newstr=newstr+arr[i];
        }
        return newstr;

    }

}
