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
     * 
     * 1.H排序降序,H相同時K升序排序
     * 2.排序完畢後,根據K插入到K位置上
     * 核心思想：高個子先站好位，矮個子插入到K位置上，前面肯定有K個高個子，矮個子再插到前面也滿足K的要求
     */
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (p1, p2) -> p1[0] == p2[0] ? p1[1] - p2[1] : p2[0] - p1[0]);
        ArrayList<int[]> list = new ArrayList<>();
        for(int[] p : people){
            list.add(p[1], p);
        }
        return list.toArray(new int[list.size()][2]);
    }


}