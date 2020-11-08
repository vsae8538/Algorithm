import java.math.BigDecimal;
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


class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        if(grid == null)
            return 0;
        int n = grid.length, m = grid[0].length;
        int res = 0;
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                if(grid[i][j] == 1){
                    res = Math.max(res, dfs(grid, i, j));
                }
            }
        }

        return res;
    }



    public int dfs(int[][] grid, int x, int y){
        if(x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] != 1){
            return 0;
        }
    
        int area = 1;
        grid[x][y] = 0;
        
        area += dfs(grid, x+1, y);
        area += dfs(grid, x-1, y);
        area += dfs(grid, x, y+1);
        area += dfs(grid, x, y-1);
        
        return area;
    }

}



