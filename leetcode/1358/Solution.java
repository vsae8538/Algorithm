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
import java.util.Stack;

class Solution {

    /**
     * Sliding Window
     */

     
    public int numberOfSubstrings(String s) {
        int count[] = {0, 0, 0}, res = 0 , i = 0, n = s.length();
        for (int j = 0; j < n; ++j) {
            ++count[s.charAt(j) - 'a'];
            while (count[0] > 0 && count[1] > 0 && count[2] > 0)
                --count[s.charAt(i++) - 'a'];
            res += i;
        }
        return res;
    }


    /*
        TLE
    */
    // public int numberOfSubstrings(String s) {
    //     int res = 0;
    //     for(int i = 0;i < s.length();i++){
    //         Set<Character> set = new HashSet<>();
    //         for(int j = i;j < s.length();j++){
    //             set.add(s.charAt(j));
    //             if(set.contains('a') && set.contains('b') && set.contains('c')) res++;
    //         }
    //         set.clear();    
    //     }
    //     return res;
    // }


}



