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
    class Ugly {
        public int[] nums = new int[1690];
        Ugly() {
          nums[0] = 1;
          int ugly, i2 = 0, i3 = 0, i5 = 0;
      
          for(int i = 1; i < 1690; ++i) {
            ugly = Math.min(Math.min(nums[i2] * 2, nums[i3] * 3), nums[i5] * 5);
            nums[i] = ugly;
      
            if (ugly == nums[i2] * 2) ++i2;
            if (ugly == nums[i3] * 3) ++i3;
            if (ugly == nums[i5] * 5) ++i5;
          }
        }
      }

      class Solution {
        public static Ugly u = new Ugly();
        public int nthUglyNumber(int n) {
          return u.nums[n - 1];
        }
      }

    /**
     * TLE
     */
    // public int nthUglyNumber(int n) {
    //     int i = 0;
    //     int num = 1;
    //     while(i < n){
    //         if(isUgly(num)){      
    //             i++;
    //         }
    //         num++;
    //     }
    //     return --num;
    // }

    // public boolean isUgly(int num) {
    //     if(num < 0) return false;
    //     while(num > 1){
    //         if(num % 2 == 0){
    //             num /= 2; 
    //         }else if(num % 3 == 0){
    //             num /= 3;
    //         }else if(num % 5 == 0){
    //             num /= 5;
    //         }else{
    //             return false;
    //         }
    //     }
        
    //     return true;
    // }

}



