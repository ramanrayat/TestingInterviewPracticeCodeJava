public class count_type_of_character {
    public static void main(String[] args) {

        String s = "I@Love*13";
        int upper=0,lower=0,special=0,number=0;
        char arr[] = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(arr[i]>='a' && arr[i]<='z'){
                lower++;
            } else if (arr[i]>='A' && arr[i]<='Z') {
                number++;
            } else if (arr[i]>='0' && arr[i]<='9') {
                upper++;
            } else {
                special++;
            }
        }
        System.out.println("lower "+lower);
        System.out.println("upper "+upper);
        System.out.println("special "+special);
        System.out.println("number "+number);

    }
}
