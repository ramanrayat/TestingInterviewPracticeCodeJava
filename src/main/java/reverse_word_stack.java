import java.util.Stack;

public class reverse_word_stack {

    public static void main(String[] args) {

        String s1 = "hello";
        String newtext = "";

        Stack<Character> s2 = new Stack<>();

        for(Character s : s1.toCharArray()){
            s2.push(s);
        }
        while (!s2.isEmpty()) {
            newtext = newtext + s2.pop();
        }
        System.out.println(newtext);
    }
}
