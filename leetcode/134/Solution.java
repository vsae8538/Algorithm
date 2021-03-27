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


    public int canCompleteCircuit(int[] gas, int[] cost) {
        int currentSum = 0;
        int totalSum = 0;
        int start = 0;

        for(int i = 0;i < gas.length;i++){
            currentSum += gas[i] - cost[i];
            totalSum += gas[i] - cost[i];
            if(currentSum < 0){//若當前currentSum為負數,起始點一定是i+1
                start = i + 1; 
                currentSum = 0; //重新計算
            }
        }
        
        if(totalSum < 0) return -1; //不可能跑完一圈,因總cost>總gas

        return start;

    }



}
