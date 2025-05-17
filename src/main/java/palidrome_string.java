public class palidrome_string {
    public static void main(String[] args) {
        String value = "abba";
        String check = "";
        for(int i=value.length()-1;i>=0;i--){
            check=check+value.charAt(i);
        }
        System.out.println(check);
        if(value.equals(check)){
            System.out.println("String is palidrome");
        }else {
            System.out.println("String is not palidrome");
        }
    }
}
