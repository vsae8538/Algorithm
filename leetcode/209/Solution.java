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
            int l = 0,r = 0,cur = 0,res = Integer.MAX_VALUE;
            while(r < nums.length){
                cur += nums[r];   
                while(cur >= s){
                    res = Math.min(res,r-l+1);
                    cur -= nums[l++];
                }
                r++;
            }
            return res== Integer.MAX_VALUE ? 0 : res;
        }


                /**
         * 滑動窗口
         * @param s
         * @param nums
         * @return
         */

        // public int minSubArrayLen(int s, int[] nums) {
        //     if(nums.length < 1 || nums == null) return 0;
        //     int l = 0,r = 0;
        //     int res = Integer.MAX_VALUE, len = 0,sum = 0;
        //     while(r < nums.length){
        //         sum += nums[r++];
        //         len++;
        //         if(sum >= s){
        //             res = Math.min(res, len);
        //             l++;
        //             len = 0;
        //             sum = nums[l];
        //         }
        //     }
        //     if(res < Integer.MAX_VALUE) return res;
        //     else return 0;
        // }
}



