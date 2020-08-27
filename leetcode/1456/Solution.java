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


    /***
     * 滑動窗口
       
     */
    public int maxVowels(String s, int k) {
        int left = 0;
        int count = 0;
        int result = 0;
        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            if (right < k) {
                if (isVowel(rightChar)) {
                    count++;
                }
                result = count;
            } else {
                if (isVowel(rightChar)) {
                    count++;
                }
                char leftChar = s.charAt(left);
                if (isVowel(leftChar)) {
                    count--;
                }
                result = Math.max(result, count);
                left++;
            }
        }
        return result;

    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'o' || c == 'e' || c == 'i' || c == 'u';
    }


    /***
     * 滑動窗口
        TLE
     */
    // public int maxVowels(String s, int k) {
    //     int res = 0;
    //     int r = 0,l = 0,len = 0;
    //     while(r < s.length()){
    //         len = r - l + 1;
    //         if(len == k){
    //             int pt = l, num = 0;
    //             while(pt <= r){
    //                 if(s.charAt(pt) == 'a' || s.charAt(pt) == 'e'
    //                 || s.charAt(pt) == 'i' || s.charAt(pt) == 'o'
    //                 || s.charAt(pt) == 'u'){
    //                     num++;
    //                 }    
    //                 pt++;
    //             }
    //             res = Math.max(num, res);
    //             l++;
    //         }
    //         r++;
    //     }
    //     return res;
    // }

}



