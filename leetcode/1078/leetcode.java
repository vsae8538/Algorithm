import java.util.ArrayList;
import java.util.List;

class leetcode {
    public static void main(String[] args) {
        
    }
    public String[] findOcurrences(String text, String first, String second) {
        String[] words = text.split(" ");
        List<String> list = new ArrayList<String>(); 
        int c = 0;
        for(int i = 0;i < words.length;i++){
            if(c == 2){
                list.add(words[i]);
                c = 0;
            }
            if(c == 0){
                if(words[i].equals(first)){
                    c++;
                    continue;
                }
            }
            if(c == 1){
                if(words[i].equals(second))
                    c++;
                else
                    c = 0;
                if(words[i].equals(first))
                    c++;
            }
        }
        String[] res = new String[list.size()];
        return list.toArray(res);
    }

}