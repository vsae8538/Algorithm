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
    

    /**
     * 原地轉置矩陣+反轉
     */
    public void rotate(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length, tmp = 0;
        for(int i = 0;i < n;i++){
            for(int j = i;j < m;j++){
                tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        } 

        for(int i = 0;i < m;i++){
            for(int j = 0,k = n -1;j < k;j++,k--){
                tmp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = tmp; 
            }
        }
    }



}



