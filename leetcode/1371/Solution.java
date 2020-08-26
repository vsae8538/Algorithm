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
     * TLE
     *
     */
    // public int findTheLongestSubstring(String s) {
    //     String res = "";
    //     int[] arr = new int[26];
    //     for(int i = 0;i < s.length();i++){
    //         if(s.length() - i < res.length()) break;
    //         StringBuffer sb = new StringBuffer();
    //         for(int j = i;j < s.length();j++){
    //             if(s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i'
    //             || s.charAt(j) == 'o' || s.charAt(j) == 'u'){
    //                 arr[s.charAt(j) - 'a']++;
    //             }
    //             sb.append(s.charAt(j));
    //             if(arr['a' - 'a'] % 2 == 0 &&
    //                arr['e' - 'a'] % 2 == 0 && arr['i' - 'a'] % 2 == 0 &&
    //                arr['o' - 'a'] % 2 == 0 && arr['u' - 'a'] % 2 == 0){
    //                    if(res.length() < sb.length()){
    //                        res = sb.toString();
    //                    }
    //                }
    //         }
    //         arr = new int[26];  
    //     }

    //     return res.length();
    // }

}



