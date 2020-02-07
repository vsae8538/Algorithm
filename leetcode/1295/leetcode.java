import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

class leetcode {
    public static void main(String[] args) {
        
    }

    public int findNumbers(int[] nums) {
        int res = 0;
        for(int i = 0;i < nums.length;i++)
            if(String.valueOf(nums[i]).length() % 2 == 0) 
                res++;
        return res;
    }

}   