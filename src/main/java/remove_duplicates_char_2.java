import java.util.LinkedHashSet;
import java.util.Set;

public class remove_duplicates_char_2 {
    public static void main(String args[]) {
        String val = "raman";
        char[] val2 = val.toCharArray();
        Set<Character> s1 = new LinkedHashSet<>();
        for(Character s2: val2){
            s1.add(s2);
        }
        System.out.println(s1);

        StringBuffer sb = new StringBuffer();
        for(Character ch: s1){
            sb.append(ch);
        }
        System.out.println(sb);
    }
}