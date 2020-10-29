import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
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


class Solution {

    public List<String> summaryRanges(int[] nums) {
        
        List<String> res = new LinkedList<>();
        if(nums.length == 0) 
            return res;
        else if(nums.length == 1){
            res.add(""+nums[0]);
            return res;
        }
        
        String str = "";
        int start = 0;
        for(int i = 0;i < nums.length;i++){
            if(i == nums.length-1 || nums[i]+1 != nums[i+1]){
                if(start == i){
                    res.add(nums[start]+"");
                }else{
                    res.add(nums[start]+"->"+nums[i]);
                }
                start = i == nums.length - 1 ? 0 : i+1; 
            }
        }


        return res;
    }


}



