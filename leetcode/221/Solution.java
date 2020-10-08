import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
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


class Solution {

    public int maximalSquare(char[][] matrix) {
        int max = 0;
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return max;
        }
        int n = matrix.length,m = matrix[0].length;
        int[][] dp = new int[n][m];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                if (matrix[i][j] == '1') {
                    if(i == 0 || j == 0){
                        dp[i][j] = 1;
                    }else{
                        dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                    }
                    max = Math.max(max, dp[i][j]);
                }
            }

        }
        return max * max; //正方形面積
    }

}



