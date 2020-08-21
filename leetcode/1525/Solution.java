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
     * 
     * 
     * 滑動窗口
     * 
     */

    public int numSplits(String s) {
        int size = 26;
        int[] leftCount = new int[size];
        int[] rightCount = new int[size];
        int leftVaild = 0;
        int rightVaild = 0;
        for(char ch : s.toCharArray()){
            int num = ch - 'a';
            if(rightCount[num] == 0){
                rightVaild++;
            }
            rightCount[num]++;
        }

        int c = 0;
        for(char ch : s.toCharArray()){
            int num = ch - 'a';
            if(leftCount[num] == 0){
                leftVaild++;
            }
            if(rightCount[num] == 1){
                rightVaild--;
            }
            leftCount[num]++;
            rightCount[num]--;
            if(leftVaild == rightVaild){
                c++;
            }
        }
        return c;
    }


    /**
     * 
     * 
     * Time Limit Exceeded
     * 
     */
    // public int numSplits(String s) {
    //     int res = 0;
    //     for(int i = 0;i < s.length();i++){
    //         int ps = 0, qs = 0;
    //         Set<Character> p_set = new HashSet<>();
    //         Set<Character> q_set = new HashSet<>();
    //         String p = s.substring(0, i);
    //         String q = s.substring(i, s.length());            
    //         for(int k = 0;k < p.length();k++) p_set.add(p.charAt(k));
    //         for(int k = 0;k < q.length();k++) q_set.add(q.charAt(k));
    //         for(Character c : p_set)
    //             if(!q_set.contains(c)) ps++;
    //         for(Character c : q_set)
    //             if(!p_set.contains(c)) qs++;
    //         if(ps == qs) res++;
    //     }

    //     return res;
    // }

}
