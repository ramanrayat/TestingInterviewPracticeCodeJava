public class occurence_of_single_character {

    public static void main(String[] args) {

        String s = "I love my india";
        int count =0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='i' || s.charAt(i)=='I' ){
                count++;
            }
        }

        System.out.println("I="+count);

    }
}
