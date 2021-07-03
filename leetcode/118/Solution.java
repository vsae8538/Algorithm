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
import java.util.Random;

class Solution{

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0;i < numRows;i++){
            List<Integer> list = new ArrayList<>();
            for(int j = 0;j <= i;j++){
                if(j == 0){
                    list.add(1);
                }else if(j == i){
                    list.add(1);
                }else{
                    list.add(res.get(i-1).get(j) + res.get(i-1).get(j-1));
                }
            }
            res.add(list);
        }

        return res;
    }

}   


