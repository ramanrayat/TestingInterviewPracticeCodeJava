public class sum_integer_element_in_array {
    public static void main(String[] args) {
        String arr[] = {"1","e","4","&","9"};
        int sum=0;
        for(String val:arr){
            try{
                sum =sum+Integer.parseInt(val);
            }catch (NumberFormatException e){

            }
        }
        System.out.println(sum);
    }
}
