public class print_each_character_2_times {
    public static void main(String[] args) {
        String value = "hello";
        String newValue = "";
        for(int i=0;i<value.length();i++){
            for(int j=0;j<2;j++){
                newValue = newValue+value.charAt(i);
            }
        }
        System.out.println(newValue);
    }
}
