public class remove_duplicates_char {
    public static void main(String[] args) {

        String val ="ramanrayat";
        String newtext = "";

        for(int i=0;i<val.length();i++){
            if(!newtext.contains(String.valueOf(val.charAt(i)))){
                newtext=newtext+val.charAt(i);
            }

        }

        System.out.println(newtext);

    }
}
