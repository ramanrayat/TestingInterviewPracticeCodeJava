public class a2b2c3d2 {
    public static void main(String[] args) {
        String value = "aabbcccdd";
        int count=1;
        StringBuilder result = new StringBuilder();

        for(int i=0;i<value.length();i++){
            if(i+1<value.length() && value.charAt(i)==value.charAt(i+1)){
                count++;
            }else{
                result.append(value.charAt(i)).append(count);
                count = 1;
            }
        }
        System.out.println(result);
    }
}
