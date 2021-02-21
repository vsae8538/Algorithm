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

    public int[] remElement(int[] arr, int index) {
        for (int i = index + 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        return arr;
    }    
    
    public int removeDuplicates(int[] nums) {
        int count = 1, len = nums.length - 1, i = 1;
        while(i <= len){
            if(nums[i] == nums[i - 1]){
                count++;
                if(count > 2){
                    remElement(nums, i);
                    len--;
                    i--;
                }
            }else{
                count = 1;
            }
            i++;
        }
        return i;
    }
}