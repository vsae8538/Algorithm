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
    public boolean kLengthApart(int[] nums, int k) {
        int cnt = 0;
        int dis = 0;
        if(k == 0){
            for(int n : nums)
                if(n == 0) 
                    return false;
            return true;
        }
        for(int i = 0;i < nums.length;i++){
            if(dis > 1 && k > 0){
                return false;
            }
            if(nums[i] == 0){
                cnt++;
                dis = 0;
            }
            else{
                if(cnt != 0 && cnt < k){
                    return false;
                }
                cnt = 0;
                dis++;
            }
        }
        return true;
    }
}

