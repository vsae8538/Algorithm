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

   // O(n^2) 
   public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        for(int i = 0 ;i < nums.length;i++){
            int cnt = 0;
            for(int j = 0 ;j < nums.length;j++){
                if(i != j && nums[j] < nums[i]){
                    cnt++;
                }
            }
            res[i] = cnt;
        }
        return res;
    }
}   