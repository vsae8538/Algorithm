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
     * 前綴+後綴
     */
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] L = new int[len];
        int[] R = new int[len];
        int[] ans = new int[len];

        //L[i]為索引i左側所有數的乘積
        L[0] = 1;
        for(int i = 1;i < len;i++) L[i] = L[i-1] * nums[i-1];  
        //R[i]為索引i右側所有數的乘積
        R[len-1] = 1;
        for(int i = len-2;i >= 0;i--) R[i] = R[i+1] * nums[i+1]; 
        
        //對於索引i,除了nums[i]的乘積總數為左邊所有元素乘積和右邊所有元素的乘積
        for(int i = 0;i < len;i++) ans[i] = L[i] * R[i]; 

        return ans;
    }

}
