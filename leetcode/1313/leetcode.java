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

    public int[] decompressRLElist(int[] nums) {
        int len = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 1;i < nums.length;i+=2){
            for(int j = 0;j < nums[i-1];j++){
                list.add(nums[i]);
            }
        }
        int[] res = new int[list.size()];
        for(int i = 0;i <list.size();i++)
            res[i] = list.get(i);
        return res;
    }

}   