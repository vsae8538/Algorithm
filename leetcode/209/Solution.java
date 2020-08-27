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
import java.util.Stack;

class Solution {


        /**
         * 滑動窗口
         * @param s
         * @param nums
         * @return
         */
        public int minSubArrayLen(int s, int[] nums) {
            if(nums.length < 1 || nums == null) return 0;
            int l = 0,r = 0;
            int res = Integer.MAX_VALUE, len = 0,sum = 0;
            while(l <= r && r < nums.length){
                sum += nums[r++];
                len++;
                if(sum >= s){
                    res = Math.min(res, len);
                    l++;
                    r = l + 1;
                    len = 0;
                    sum = 0;
                }else if(r == nums.length-1){
                    l++;
                    r = l + 1;
                    len = 0;
                    sum = 0;
                }
            }
            if(res < Integer.MAX_VALUE) return res;
            else return 0;
        }
}



