package otherConceptJava;

import java.util.HashMap;

public class test_random_1 {

    public static void main(String[] args) {

        String word = "raman";
        char temp = ' ';
        String sorted_word="";
        char word_array[] = word.toCharArray();

        for(int i=0;i<word.length();i++){
            for(int j=i+1;j<word.length();j++){
                if(word_array[i]>word_array[j]){
                    temp = word_array[i];
                    word_array[i] = word_array[j];
                    word_array[j] = temp;
                }
            }

        }

        for(int i=0;i<word_array.length;i++){
            sorted_word = sorted_word+word_array[i];
        }
        System.out.println(sorted_word);

    }
}
