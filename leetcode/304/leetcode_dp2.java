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
     * 二維緩存列
     * 將緩存概念擴展到二維,每次緩存一個矩陣區塊
     * sum(abcd)=sum(od)−sum(ob)−sum(oc)+sum(oa)
     */
    class NumMatrix {
        
        public int[][] dp;
        public NumMatrix(int[][] matrix) {
            if(matrix.length == 0 || matrix[0].length == 0 || matrix == null) return;
            dp = new int[matrix.length+1][matrix[0].length+1];
            for(int i = 0;i < matrix.length;i++){
                for(int j = 0;j < matrix[0].length;j++){
                    dp[i+1][j+1] = dp[i][j+1] + dp[i+1][j] + matrix[i][j] - dp[i][j];
                }
            }
         }
        
        public int sumRegion(int row1, int col1, int row2, int col2) {            
            return dp[row2 + 1][col2 + 1] - dp[row1][col2 + 1] - dp[row2 + 1][col1] + dp[row1][col1];
        }
    }
}

