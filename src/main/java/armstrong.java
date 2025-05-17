public class armstrong {
    public static void main(String[] args) {

        int num =121,rem,arm=0;
        int check = num;
        while (num>0){
            rem = num%10;
            arm = arm + (rem * rem * rem);
            num = num/10;
        }

        System.out.println(arm);
        System.out.println(check);

        if(check==arm){
            System.out.println("number is armstrong");
        }else{
            System.out.println("number is not an armstrong");
        }
    }
}
