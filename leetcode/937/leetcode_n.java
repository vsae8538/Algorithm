import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class leetcode {
    public static void main(String[] args) {
        
    }   
    public String[] reorderLogFiles(String[] logs) {
        List<String> digit_logs = new ArrayList<String>();
        List<String> letter_logs = new ArrayList<String>();
        for(String s:logs){
            String[] st = s.split(" ",2);
            boolean isDigit = Character.isDigit(st[1].charAt(0));
            if(isDigit){
                digit_logs.add(s);     
            }
            else{
                letter_logs.add(s);
            }
        }  

        for(int i = 0;i < letter_logs.size() - 1;i++){
            String[] st = letter_logs.get(i).split(" ", 2);
            for(int j = i;j < letter_logs.size();j++){
                String[] st2 = letter_logs.get(j).split(" ", 2);
                if(st[1].compareTo(st2[1]) > 0){
                    String tmp = letter_logs.get(i);
                    letter_logs.add(i, letter_logs.get(j));
                    letter_logs.add(j, tmp);
                }
            }
        }
        String[] res = new String[letter_logs.size()];
        for(String s : digit_logs){
            letter_logs.add(s);
        }
        res = letter_logs.toArray(res);
        return res;   
    }
}
