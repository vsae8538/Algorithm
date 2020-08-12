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
import java.util.Stack;

class leetcode {


    public static void main(String[] args) {    

    }
    /*
        dp
    word1:horse
    word2:ros
    0 1 2 3 
    1 [1 2 3
    2 2 1 2
    3 2 2 2
    4 3 3 2
    5 4 4 3]
    */
    public int minDistance(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        
        int[][] dp = new int[n1+1][n2+1];
        for(int i = 1;i <= n1;i++)
            dp[i][0] = dp[i-1][0] + 1;
        for(int j = 1;j <= n2;j++)
            dp[0][j] = dp[0][j-1] + 1;

        for(int i = 1;i <= n1;i++){
            for(int j = 1;j <= n2;j++){
                if(word1.charAt(i - 1) == word2.charAt(j - 1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.min(Math.min(dp[i][j-1], dp[i-1][j]), dp[i-1][j-1]) + 1;
                }
            }
        }
        return dp[n1][n2];
    }
}

