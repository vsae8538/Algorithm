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
     * 降序排序
     * 3 30 --> 330 > 303
     * 3比30大,因此arr[i] = 3 arr[i+1] = 30
     */
    
    private class LargerNumberComparator implements Comparator<String> {
        @Override
        public int compare(String a, String b) { 
            String order1 = a + b;
            String order2 = b + a;
           return order2.compareTo(order1);
        }
    }

    public String largestNumber(int[] nums) {
        String[] asStrs = new String[nums.length];
        for(int i = 0;i < nums.length;i++){
            asStrs[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(asStrs, new LargerNumberComparator());

        if (asStrs[0].equals("0")) {
            return "0";
        }

        String largestNumberStr = new String();
        for (String numAsStr : asStrs) {
            largestNumberStr += numAsStr;
        }

        return largestNumberStr;
    }
}
