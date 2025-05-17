public class sum_of_digit_number {
    public static void main(String[] args) {
        int num = 3341,sum=0,rem;
        while (num>0){
            rem = num%10;
            sum = sum+rem;
            num = num/10;
        }
            System.out.println(sum);
    }
}
