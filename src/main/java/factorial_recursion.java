public class factorial_recursion {

    static int factorial(int num){
        int sum=0;

        if(num==0){
            return 1;
        }else
//            return num *factorial(num-1);
            sum=sum+ num *factorial(num-1);
        return sum;
    }
    public static void main(String[] args)
    {
        System.out.println(factorial(3));
    }
}
