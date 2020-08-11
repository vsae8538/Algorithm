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
    /**
     * 
     * 二維緩存
     * 
     * [
     * [1,2,3]
     * [4,5,6]
     * [7,8,9]
     * ]
     */
    public int[][] matrixBlockSum(int[][] mat, int K) {
        int[][] res = new int[mat.length][mat[0].length];
        int[][] dp = new int[mat.length+1][mat[0].length+1];
        for(int i = 0;i < mat.length;i++){
            for(int j = 0;j < mat[0].length;j++){
                dp[i+1][j+1] = dp[i][j+1] + dp[i+1][j] + mat[i][j] - dp[i][j];
            }
        } 
        for(int i = 1;i <= mat.length;i++){
            for(int j = 1;j <= mat[0].length;j++){
                int r = Math.max(i - K - 1, 0); // r = i - K > 0 ? i - K : 0
                int c = Math.max(j - K - 1, 0); // c = j - K > 0 ? j - K : 0
                int rm = Math.min(i + K, mat.length); // r = i + K > res.length ? i + K : 0 
                int cm = Math.min(j + K, mat[0].length); // r = j + K > res.length ? j + K : 0 
                res[i-1][j-1] = dp[rm][cm] - dp[r][cm] - dp[rm][c] + dp[r][c];
            }
        }
        return res;
    }
}

