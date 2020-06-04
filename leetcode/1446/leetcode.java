import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

class leetcode {
    public static void main(String[] args) {    
        
    }
    public int maxPower(String s) {
        if(s.length() == 1){
            return 1;
        }

        char c = s.charAt(0);
        int count = 1;
        int max = count;
        for(int i = 1;i < s.length();i++){
            if(c == s.charAt(i)){
                count++;
            }else{
                count = 1;
                c = s.charAt(i);
            }
            if(count >= max) max = count;
        }
        return max;
    }
}

