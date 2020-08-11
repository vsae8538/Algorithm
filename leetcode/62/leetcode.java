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
    */
    public int uniquePaths(int m, int n) {
        if(m <= 0 || n <= 0){
            return 0;
        }

        int[][] dp = new int[m][n];

        for(int i = 0;i < m;i++){
            dp[i][0] = 1;
        }

        for(int j = 0;j < n;j++){
            dp[0][j] = 1;
        }

        for(int i = 1;i < m;i++){
            for(int j = 1;j < n;j++){
                dp[i][j] = dp[i][j-1] + dp[i-1][j];
            }
        }
        return dp[m-1][n-1];
    }
}

