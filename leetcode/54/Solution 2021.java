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
     * 2021
     * @param matrix
     * @return
     */
    // [[1,2,3,4],
    //  [5,6,7,8],
    //  [9,10,11,12],
    //  [13,14,15,16]]
    // //[1,2,3,4,8,12,16,15,14,13,9,10,11,7,6,5]
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        dfs(matrix, 0, 0, new boolean[matrix.length][matrix[0].length], res, false);
        return res;
    }


    public void dfs(int[][] matrix, int i, int j, boolean[][] visited, List<Integer> list, boolean isUp){
        if(i < 0 || j < 0 || i >= matrix.length || j >= matrix[0].length || visited[i][j]){
            return;
        }
        visited[i][j] = true;
        list.add(matrix[i][j]);
        if(isUp == true){
            dfs(matrix, i-1, j, visited, list, true);
        }
        dfs(matrix, i, j+1, visited, list, false);
        dfs(matrix, i+1, j, visited, list, false);
        dfs(matrix, i, j-1, visited, list, false);
        dfs(matrix, i-1, j, visited, list, true);
    }
}