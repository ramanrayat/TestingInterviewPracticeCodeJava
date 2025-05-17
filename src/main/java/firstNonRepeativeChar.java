public class firstNonRepeativeChar {

    public static void main(String[] args) {
        String value = "software testing";

        for(int i=0;i<value.length();i++){
            Boolean flag =false;
            for(int j=0;j<value.length();j++){

                if(i!=j && value.charAt(i)==value.charAt(j)){
                    flag= true;
                }
            }
            if(!flag){
                System.out.println(value.charAt(i));
                break;
            }


        }
    }






}
