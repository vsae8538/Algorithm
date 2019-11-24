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
import java.util.Stack;

class leetcode {
    public static void main(String[] args) {
  
    }
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int pre = nums[0] * nums[1] * nums[nums.length - 1];
        int post = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        return pre > post ? pre : post;
    }
}
