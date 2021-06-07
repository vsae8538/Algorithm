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


    String max = "";
    public String longestPalindrome(String s) {
        int len = s.length();
        int[][] dp = new int[len][len];
        
        for(int i = 0;i < len;i++){
            dp[i][i] = 1;
        }

        
        for(int j = 0;j < len;j++){
            for(int i = 0;i < j;i++){
                if(j - i == 1 && s.charAt(i) == s.charAt(j)){
                    dp[i][j] = 2;
                }
                else if(j - i > 1 && s.charAt(i) == s.charAt(j) && dp[i+1][j-1] > 0){
                    dp[i][j] = dp[i+1][j-1] + 2;
                }
            }
        }

        int max = 0, k = 0, r = 0;
        for(int i = 0;i < len;i++){
            for(int j = 0;j < len;j++){
                //System.out.print(dp[i][j] + " ");
                if(max < dp[i][j]){
                    max = dp[i][j];
                    k = i;
                    r = j;
                }
            }
            //System.out.println();
        }

        //System.out.println(s.substring(k, r+1));
        return s.substring(k, r+1);
    }


    /**
     * 暴力迭代
     */
    // String max = "";
    // public String longestPalindrome(String s) {
    //     for(int i = 0; i < s.length();i++){
    //         for(int j = i + 1;j <= s.length();j++){
    //             String sub = s.substring(i, j);
    //             if(isPalindrome(sub)){
    //                 max = max.length() > sub.length() ? max : sub; 
    //             }
    //         }
    //     }
    //     return max;
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

    /**
     * 暴力遞歸 TLE
     */
    // String max = "";
    // public String longestPalindrome(String s) {
    //     for(int i = 0; i < s.length();i++){
    //         dfs(s, new StringBuilder(), i, s.length());
    //     }
        
    //     return max;
    // }
 

    // public void dfs(String s, StringBuilder sb, int index, int len){
    //     if(sb.length() != 0 && isPalindrome(sb.toString())){
    //         max = max.length() > sb.toString().length() ? max : sb.toString(); 
    //     }

    //     if(index == len){
    //         return;
    //     }

    //     sb.append(s.charAt(index));

    //     dfs(s, sb, index + 1, len);
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