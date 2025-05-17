public class seperate_small_upper_case {
    public static void main(String[] args) {

        String value = "aBACbcEDed";
        String small = "";
        String upper = "";

        for(int i=0;i<value.length();i++){
            if(value.charAt(i)>='a' && value.charAt(i)<='z'){
                small=small+value.charAt(i);
            }else{
                upper=upper+value.charAt(i);
            }
        }
        System.out.println(small);
        System.out.println(upper);

    }
}
