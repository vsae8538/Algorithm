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
    int n,m;
    public void solve(char[][] board) {
        if(board == null || board.length == 0)
            return;
        n = board.length;
        m = board[0].length;
    
        for(int i = 0;i < n;i++){
            dfs(board, i, 0);
            dfs(board, i, m-1);
        }
        for(int i = 0;i < m;i++){
            dfs(board, 0, i);
            dfs(board, n-1, i);
        }
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                if(board[i][j] == 'F'){
                    board[i][j] = 'O';
                }else if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
            }
        }
    }

    public void dfs(char[][] board, int x, int y){
        if(x < 0 || x >= n || y < 0 || y >= m || board[x][y] != 'O'){
            return;
        }
        board[x][y] = 'F';
        dfs(board, x+1, y);
        dfs(board, x-1, y);
        dfs(board, x, y+1);
        dfs(board, x, y-1);
    }
}