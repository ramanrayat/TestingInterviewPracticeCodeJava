public class findWordWithoutContains {

        public static void main(String[] args) {

            String first = "Modi ji is a bold Prime Minister of india";
            String second = "india";
            char secondArray[] = second.toCharArray();
            String firstArrayWords[] = first.split(" ");
            for(int i=0;i<firstArrayWords.length;i++){
                boolean flag = true;
                if(firstArrayWords[i].length()==secondArray.length){

                    for(int j=0;j<secondArray.length;j++){

                        if(firstArrayWords[i].toCharArray()[j]!=secondArray[j]){
                            flag= false;
                        }else {
                            if (!flag){
                                break;
                            }}}

                    if(flag){
                        System.out.println("found");
                        System.out.println("At Index "+i+" found the value");
                        break;
                    }}}

        }


}
