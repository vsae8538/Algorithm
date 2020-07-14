import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import javafx.print.Collation;

class leetcode {


    public static void main(String[] args) {    

    }
    /*
        使用陣列map,26個字元依序遍歷
    */
    public String sortString(String s) {
        int n = s.length();
        if(n == 0) 
            return s;

        int[] map = new int[26];
        char[] res = new char[n];
        
        for(int i = 0;i < n;i++){
            map[s.charAt(i) - 'a']++;
        }
            
        int x = 0, i;
        while(x < n){
            for(i = 0;i < 26;i++){
                if(map[i] > 0){
                    res[x++] = (char)('a' + i);
                    --map[i];
                }
            }
            for(i = 25;i >= 0;i--){
                if(map[i] > 0){
                    res[x++] = (char)('a' + i);
                    --map[i];
                }
            }
        }
        return new String(res);
    }

}

