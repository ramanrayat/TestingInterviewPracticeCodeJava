import java.util.Stack;

public class parenthesesCheck {
    public static void main(String[] args) {
        parenthesesCheck pc = new parenthesesCheck();
        System.out.println(pc.isValid("{[]}"));
    }

    public Character getVal(Character ch){
        Character c=' ';
        if(ch=='}'){
            c='{';
        } else if (ch==']') {
            c='[';
        } else if (ch==')') {
            c='(';
        }
        return c;
    }

    public boolean isValid(String value){
        String opening ="{([";
        String closing ="})]";
        Stack stc = new Stack();

//        if(value.length()%2==1){
//            return false;
//        }

        for(Character ch:value.toCharArray()){
            if(opening.indexOf(ch)!=-1){
                stc.push(ch);
            }else{
                if(stc.isEmpty()) return false;
                if(!getVal(ch).equals(stc.pop())){
                    return false;
                }

            }
        }

        return stc.isEmpty();
    }

}