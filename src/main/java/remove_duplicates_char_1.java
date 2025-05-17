public class remove_duplicates_char_1 {

    public static void main(String args[]){

        String s1 = "raman";
        String s2 = "";

        for(int i=0;i<s1.length();i++){
            boolean flag=false;
            for(int j=0;j<s2.length();j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    flag=true;
                    break;
                }

            }if (flag==false){
                s2 = s2.concat(String.valueOf(s1.charAt(i)));
            }
        }
        System.out.println(s2);
    }

}
