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

class Solution {

    /**
     * 
     * 最大堆 + Map
     * 統計數字最大出現次數並排序,填入res陣列中,每次填入都至少間隔一格(i+=2)
     */

    public int[] rearrangeBarcodes(int[] barcodes) {
        Map<Integer,Integer> map = new HashMap<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[1] - a[1]);
        for(int barcode : barcodes) map.put(barcode, map.getOrDefault(barcode, 0)+1);
        for(int k : map.keySet()) pq.offer(new int[]{k,map.get(k)});

        int[] res = new int[barcodes.length];
        int i = 0;
        while(!pq.isEmpty()){
            int[] tmpArr = pq.poll();
            while(tmpArr[1]-- > 0){
                res[i] = tmpArr[0];
                i += 2;
                if(i >= barcodes.length) i = 1;
            }
        }

        return res;
    }

}