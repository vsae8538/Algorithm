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
     * 緩存列
     */
    class NumMatrix {
        
        public int[][] matrix;
        public int[][] dp;
        public NumMatrix(int[][] matrix) {
            if(matrix.length == 0 || matrix[0].length == 0 || matrix == null){
                this.matrix = matrix;
            }else{
                this.matrix = matrix;
                dp = new int[matrix.length][matrix[0].length+1];
                for(int i = 0;i < matrix.length;i++){
                    for(int j = 0;j < matrix[0].length;j++){
                        dp[i][j+1] = dp[i][j] + matrix[i][j];
                    }
                }
            }
        }
        
        public int sumRegion(int row1, int col1, int row2, int col2) {
            int res = 0;
            for(int i = row1;i <= row2;i++){
               res += dp[i][col2+1] - dp[i][col1];  
            }
            
            return res;
        }
    }
}

