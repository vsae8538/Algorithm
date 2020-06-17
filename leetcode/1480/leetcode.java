import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
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
    public int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = nums[0];
        for(int i = 1;i < nums.length;i++){
            res[i] = res[i-1] + nums[i];
        }   
        return res;
    }
}

