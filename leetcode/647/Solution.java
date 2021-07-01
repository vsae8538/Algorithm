import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;

class Solution{

  /**
   * dp
   * @param s
   * @return
   */
  public int countSubstrings(String s) {
    int len = s.length();
    boolean[][] dp = new boolean[len+1][len+1];
    
    int res = 0;

    for(int i = len - 1;i >= 0;i--){
        for(int j = i;j < len;j++){
            if(s.charAt(i) == s.charAt(j)){
                if(j - i <= 1){
                    res++;
                    dp[i][j] = true;
                }
                else if(dp[i+1][j-1]){
                    res++;
                    dp[i][j] = dp[i+1][j-1];   
                }
            }
        }
    }

    return res;
}


    /**
     * 
     * dp
     */
    public int countSubstrings(String s) {
        int count = 0;
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        
        for(int i = 0;i < len;i++){
            for(int j = 0;j < len;j++){
                dp[i][j] = false;
            }
        }

        for (int j = 0; j < len; j++) { 
            for (int i = 0; i <= j; i++) {
              if (i == j) {   //單字元 "a"
                dp[i][j] = true;
                count++;
              } else if(j - i == 1 && s.charAt(i) == s.charAt(j)) { //兩個字元 "aa"
                dp[i][j] = true;
                count++;
              } else if (j - i > 1 && s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) { 
                dp[i][j] = true;
                count++;
              }
            }
          }
          return count;
    }


      


    /**
     * 記憶化搜索
     */
    // Map<String,Integer> map = new HashMap<>();
    // int res = 0;
    // public int countSubstrings(String s) {
        
    //     for(int i = 0;i < s.length();i++){
    //         helper(s, i, s.length(), new StringBuilder());
    //         map.clear();
    //     }

    //     return res;
    // }

    // public void helper(String s, int index, int len, StringBuilder sb){
    //     if(sb.length() != 0 && map.get(sb.toString()) != null){
    //         res += map.get(sb.toString());
    //         return;
    //     }
        
    //     if(sb.length() != 0 && isPalindrome(sb.toString())){
    //         res++;
    //         map.put(sb.toString(), res);
    //     }
        
    //     if(index == len){
    //         return;
    //     }
        
    //     sb.append(s.charAt(index));
    
    //     helper(s, index + 1, len, sb);
    // }
   

    // public boolean isPalindrome(String s){
    //     int i = 0, j = s.length() - 1;
    //     while(i < j){
    //         if(s.charAt(i) != s.charAt(j)){
    //             return false;
    //         }
    //         i++;
    //         j--;
    //     }

    //     return true;
    // }

    /*
     暴力遞歸
    */
    // int res = 0;
    // public int countSubstrings(String s) {
        
    //     for(int i = 0;i < s.length();i++){
    //         helper(s, i, s.length(), new StringBuilder());
    //     }

    //     return res;
    // }

    // public void helper(String s, int index, int len, StringBuilder sb){
    //     if(sb.length() != 0 && isPalindrome(sb.toString())){
    //         res++;
    //     }
        
    //     if(index == len){
    //         return;
    //     }
        
    //     sb.append(s.charAt(index));
    
    //     helper(s, index + 1, len, sb);
    // }
   

    // public boolean isPalindrome(String s){
    //     int i = 0, j = s.length() - 1;
    //     while(i < j){
    //         if(s.charAt(i) != s.charAt(j)){
    //             return false;
    //         }
    //         i++;
    //         j--;
    //     }

    //     return true;
    // }
 

}

    

