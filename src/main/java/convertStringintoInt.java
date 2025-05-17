public class convertStringintoInt {
    public static void main(String[] args) {

        String val = "223";
        int newVal = 0;
        char arr[] = val.toCharArray();

        for(int i=0;i<arr.length;i++){
            newVal = newVal *10 + (arr[i]-'0');
        }

        System.out.println(newVal);
    }
}
