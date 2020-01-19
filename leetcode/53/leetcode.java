import java.util.ArrayList;
import java.util.Arrays;
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
        System.out.print("Hello World\n");
    }

    /* 佚代法 1
    int max = Integer.MIN_VALUE;
    public int maxSubArray(int[] nums) {
        for(int i = 0; i < nums.length;i++){
            int sum = 0;
            for(int j = i; j < nums.length;j++){
                sum += nums[j];
                if(sum > max) max = sum;
            } 
        }
        return max;
    }
    */
    /* 佚代法 2
    int max = Integer.MIN_VALUE;
    public int maxSubArray(int[] nums) {
        for(int i = 0; i < nums.length;i++){
            search(i, nums);
        }
        return max;
    }
    public void search(int index,int[] nums){
        int sum = 0;
        for(int i = index; i < nums.length;i++){
            sum += nums[i];
            if(sum > max) max = sum;
        } 
    }
    */
}

