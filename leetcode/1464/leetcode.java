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

import javafx.print.Collation;

class leetcode {


    public static void main(String[] args) {    

    }
    
    // public int maxProduct(int[] nums) {
    //     Arrays.sort(nums);
    //     return (nums[nums.length-1]-1) * (nums[nums.length-2]-1);
    // }

    // int m = Integer.MIN_VALUE, n = m;
    // for (int num: nums) {
    //     if (num >= m) {
    //         n = m;
    //         m = num;
    //     }else if (num > n) {
    //         n = num;
    //     }
    // } 
    // return (m - 1) * (n - 1);

    public int maxProduct(int[] nums) {
        int max = 0, max2 = 0,i = 0;
        for(int n = 0;n < nums.length;n++){
            if(max <= nums[n]){
                max = nums[n];
                i = n;
            }
        }
        for(int n = 0;n < nums.length;n++){
            if(max2 <= nums[n] && n != i){
                max2 = nums[n];
            }
        }
        return (max-1) * (max2-1);
    }
}

