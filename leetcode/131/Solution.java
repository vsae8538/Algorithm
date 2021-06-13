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

    boolean[][] f;
    List<List<String>> ret = new ArrayList<List<String>>();
    List<String> ans = new ArrayList<String>();
    int n;

    public List<List<String>> partition(String s) {
        n = s.length();
        f = new boolean[n][n];
        for (int i = 0; i < n; ++i) {
            Arrays.fill(f[i], true);
        }

        for (int i = n - 1; i >= 0; --i) {
            for (int j = i + 1; j < n; ++j) {
                f[i][j] = (s.charAt(i) == s.charAt(j)) && f[i + 1][j - 1];
            }
        }

        dfs(s, 0);
        return ret;
    }

    public void dfs(String s, int i) {
        if (i == n) {
            ret.add(new ArrayList<String>(ans));
            return;
        }
        for (int j = i; j < n; ++j) {
            if (f[i][j]) {
                ans.add(s.substring(i, j + 1));
                dfs(s, j + 1);
                ans.remove(ans.size() - 1);
            }
        }
    }



    /**
     * 
     * 回溯
     */
    // List<List<String>> res = new ArrayList<>();
    // public List<List<String>> partition(String s) {
    //     backtrack(s, 0, new ArrayList<>());
    //     return res;
    // }

    // public void backtrack(String s, int index, List<String> list){
    //     if(index == s.length()){
    //         res.add(new ArrayList<>(list));
    //         return;
    //     }

    //     for(int i = index;i < s.length();i++){
    //         String sub = s.substring(index, i + 1);
    //         if(!isPalindrome(sub)){
    //             continue;
    //         }
    //         list.add(sub);       
    //         backtrack(s, i + 1, list);
    //         list.remove(list.size()-1);
    //     }
    // }

    // public boolean isPalindrome(String s){
    //     int i = 0, j = s.length() - 1;
    //     while(i < j){
    //         if(s.charAt(i) != s.charAt(j)){
    //             return false;
    //         }
    //         i++;
    //         j--;
    //     }

    //     return true;
    // }
}
