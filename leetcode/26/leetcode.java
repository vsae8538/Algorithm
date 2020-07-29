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
    /*
    Do not allocate extra space for another array, 
    you must do this by modifying the input array in-place with O(1) extra memory.
    */
    public int removeDuplicates(int[] nums) {
        int i = 0, j = 0,prev = Integer.MAX_VALUE;
        for(;i < nums.length;i++){
            if(nums[i] != prev){
                nums[j] = nums[i];
                j++;
                prev = nums[i];
            }
        }
        return j;
    }
}

