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

    boolean[][] marked;
    int m,n;
    String word;
    char[][] board;
    int[][] direction = {{-1,0}, {0, -1}, {0, 1}, {1,0}};
    
    public boolean exist(char[][] board, String word) {
        if(board.length == 0) return false;
        this.board = board;
        this.word = word;
        m = board.length;
        n = board[0].length;
         marked = new boolean[m][n];
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                if(dfs(i, j, 0)){
                    return true;
                }
            }
        }
        return false;
    }


    public boolean dfs(int i, int j, int index){
        if(index == word.length() - 1){
            return board[i][j] == word.charAt(index);
        }
        if(board[i][j] == word.charAt(index)){
            marked[i][j] = true;
            for(int k = 0;k < 4;k++){
                int newX = i + direction[k][0];
                int newY = j + direction[k][1];
                if(inArea(newX, newY) && !marked[newX][newY])
                    if(dfs(newX, newY, index + 1))
                        return true;
            }
            marked[i][j] = false;
        }
        return false;
    }


    private boolean inArea(int x, int y) {
        return x >= 0 && x < m && y >= 0 && y < n;
    }
}