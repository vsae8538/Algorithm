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



    public int minSteps(String s, String t) {
        int n = s.length(), ans = 0;
        int[] arr = new int[26];
        for(int i = 0; i < n; i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        for(int i = 0; i < 26; i++) if(arr[i] > 0) ans += arr[i];
        return ans;
    }

    /**
     * T:39%
     * S:24%
     * 
     * 
     */
    // public int minSteps(String s, String t) {
    //     int[] sa = new int[26];
    //     for(char c : s.toCharArray()) sa[c - 'a']++;
        
    //     int cnt = 0;
    //     for(int j = 0;j < t.length();j++){
    //         char c = t.charAt(j);
    //         if(sa[c - 'a'] > 0){                
    //             sa[c - 'a']--;
    //             cnt++;
    //         }    
    //     }
    //     return t.length() - cnt;
    // }

    /**
     * 
             Time Limit Exceeded

     */
    // public int minSteps(String s, String t) {
    //     StringBuffer st = new StringBuffer(t);
    //     for(int i = 0;i < s.length();i++){
    //         char c = s.charAt(i);
    //         for(int j = 0;j < st.length();j++){
    //             if(st.charAt(j) == c){
    //                 st.deleteCharAt(j);
    //                 break;
    //             }    
    //         }
    //     }

    //     return st.length();
    // }

}
