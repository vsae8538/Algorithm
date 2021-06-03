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
     * 回溯
     */
    List<Integer> res;
    public boolean checkPowersOfThree(int n) {

        int k = (int)(Math.log(n)/Math.log(3));
        res = new ArrayList<>();
        backtracking(n, k, 0, 0);

        if(res.contains(n)){
            return true;
        }

        return false;
    }

    public void backtracking(int n, int limit, int cur, int index){
        
        if(cur > n){
            return;
        }

        if(cur == n){
            res.add(cur);
            return;
        }

        for(int i = index;i <= limit;i++){
            cur += (int)(Math.pow(3,i));
            backtracking(n, limit, cur, i + 1);
            cur -= (int)(Math.pow(3,i));
        }

    }

    }



    /**
     * dfs
     */
    // public boolean checkPowersOfThree(int n) {
    //     if(n == 1){
    //         return true;
    //     }
    //     int cnt = (int) Math.pow(n,1/3);
    //     for(int i = 0;i < cnt;i++){
    //         if(dfs(n, 0, i)){
    //             return true;
    //         }
    //     }

    //     return false;
    // }

    // public boolean dfs(int n, int cur, int index){
    //     if(cur > n){
    //         return false;
    //     }
    //     else if(cur == n){
    //         return true;
    //     }else{
    //         for(int i = index;i < n;i++){
    //             int num = (i == 0 ? 1 : (int) Math.pow(3, i));
    //             if(num > n){
    //                 return false;
    //             }else{
    //                 if(dfs(n, cur + num, i + 1)){
    //                     return true;
    //                 }
    //             }
    //         }
    //     }

    //     return false;
    // }

}

