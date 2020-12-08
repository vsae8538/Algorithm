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

    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[][] visited = new int[m][n];
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                if(matrix[i][j] == 0 && visited[i][j] != 1){
                    for(int k = 0;k < m;k++){
                        if(visited[k][j] == 0 && matrix[k][j] != 0){ matrix[k][j] = 0; visited[k][j] = 1;}
                    }
                    for(int k = 0;k < n;k++)
                        if(matrix[i][k] == 0 && matrix[i][k] != 0){ matrix[i][k] = 0; visited[i][k] = 1;}
                }
            }
        }
    }


}