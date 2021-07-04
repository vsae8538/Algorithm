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
import java.util.TreeSet;m
import java.util.Map.Entry;
import java.util.Random;

class Solution{


    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        int m = l.length;
        List<Boolean> res = new ArrayList<>();

        for(int i = 0;i < m;i++){
            int[] arr = Arrays.copyOfRange(nums, l[i], r[i]+1);  
            
            Arrays.sort(arr);

            if(check(arr)){
                res.add(true);
            }else{
                res.add(false);
            }
        }


        return res;
    }


    public boolean check(int arr[]){
        if(arr.length <= 2){
            return true;
        }

        int dist = arr[1] - arr[0];
        for(int k = 2;k < arr.length;k++){
            if(arr[k] - arr[k-1] != dist){
                return false;
            }
        }
        return true;
    }

}   


