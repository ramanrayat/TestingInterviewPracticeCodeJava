public class occurence_digit_in_number {
    public static void main(String[] args) {

        int number = 4345;
        int count =0;

        if(number==0){
            count = 1;
        }
        if(number<0){
            number= number* -1;
        }
        while (number>0){
            number = number/10;
            count++;
        }
        System.out.println(count);
    }
}
