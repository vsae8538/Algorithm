import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

class leetcode {


    public static void main(String[] args) {    

    }
    public int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int res = 0;
        for(int i = 0;i < nums.length;i++){
            if(map.containsKey(nums[i])){
                int cnt = map.get(nums[i]);
                res += cnt;
                map.put(nums[i], cnt+1);
            }else{
                map.put(nums[i], 1);
            }
        }
        return res;
    }

}

