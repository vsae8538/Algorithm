import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class leetcode {
    public static void main(String[] args) {
        
    }
    public boolean detectCapitalUse(String word) {
        char[] chs = word.toCharArray();
        if(Character.isLowerCase(word.charAt(0))){
            for(char c : chs){
                if(!Character.isLowerCase(c))
                    return false;
            }
        }else{
            int d = 0,st = 0;
            for(char c : chs){
                if(st == 0){
                    if(!Character.isLowerCase(c)) 
                        d++;
                    else
                        d--;
                }
                if(d == 2){
                    st = 1;
                    if(Character.isLowerCase(c))
                        return false;
                }else if(d == 0){
                    st = 1;
                    if(!Character.isLowerCase(c))
                        return false;
                }
            }
        }
        return true;
    }
}