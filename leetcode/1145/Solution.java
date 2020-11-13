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


public class Solution {

    int left;
    int right;
    int player1;
    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        player1 = x;
        dfs(root);
        int half = n / 2;
        if(left > half || right > half || (left + right) < half){
            return true;
        }else{
            return false;
        }
    }

    public int dfs(TreeNode node){
        if(node == null) return 0;
        
        int leftNum = 0,rightNum = 0;
        leftNum = dfs(node.left);
        rightNum = dfs(node.right);   
        
        if(node.val == player1){
            left = leftNum;
            right = rightNum;
        }

        return leftNum + rightNum + 1;
    }

}



