import java.lang.reflect.Array;
import java.math.BigInteger;
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
import java.util.TreeSet;


class Solution {
    
    /**
     *
     * 回溯
     * 
     */
    public int getMaximumGold(int[][] grid) {
        if (grid == null || grid.length == 0)
            return 0;

        int res = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                res = Math.max(res, dfs(grid, i, j));
            }
        }

        return res;
    }

    public int dfs(int[][] grid, int i, int j) {
    if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0)
        return 0;
        //將當前座標值暫存
        int temp = grid[i][j];
        //已經訪問過,避免再次訪問
        grid[i][j] = 0;
        //上下左右查找
        int up = dfs(grid, i, j - 1);
        int down = dfs(grid, i, j + 1);
        int left = dfs(grid, i - 1, j);
        int right = dfs(grid, i + 1, j);
        int max = Math.max(left, Math.max(right, Math.max(up, down))); //找出四方位最大值

        grid[i][j] = temp;

        return grid[i][j] + max;
    }
}



