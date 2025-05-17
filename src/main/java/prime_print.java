public class prime_print {
    static boolean isPrime(int num){
        if(num==0||num==1)
            return false;
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        int num = 10;
        for(int i=0;i<num;i++){
            if(isPrime(i)==true){
                System.out.println(i);
            }
        }
    }
}
