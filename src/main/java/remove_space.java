public class remove_space {
    public static void main(String[] args) {
        String val = "hello how are you";
        String s ="";
        for(int  i=0;i<val.length();i++){
            if(val.charAt(i)!=' '){
                s=s+val.charAt(i);
            }
        }

        System.out.println(s);
    }
}
