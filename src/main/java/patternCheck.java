import java.util.HashMap;

public class patternCheck {

    public static void main(String[] args) {

        String arrayList[] ={"badc","abab","dddd","dede","yyxx"};
        String pattern = "abab";

        for(int i=0;i<arrayList.length;i++){
            if(encode(arrayList[i]).equals(encode(pattern))){
                System.out.println(arrayList[i]);
            }
        }

    }
    public static String encode(String word){

        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        int index =0;
        StringBuilder output = new StringBuilder();

        for(Character ch:word.toCharArray()){
            if(!hm.containsKey(ch)) {
                hm.put(ch, index++);
            }
            output.append(hm.get(ch)+"");
        }
        return output.toString().trim();
    }

}
