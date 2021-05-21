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
 

    public int leastBricks(List<List<Integer>> wall) {
        int n = wall.size();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0,sum = 0;i < n;i++,sum = 0){
            for(int cur : wall.get(i)){
                sum += cur;
                map.put(sum, map.getOrDefault(sum, 0)+1);
            }
            map.remove(sum); //刪除最後一行，因為不能穿過牆的兩邊
        }

        int ans = n;
        for(int key : map.keySet()){
            int cnt = map.get(key);
            ans = Math.min(ans, n - cnt);
        }

        return ans;
    }

}

