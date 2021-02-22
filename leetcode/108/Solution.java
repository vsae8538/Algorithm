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
import java.util.TreeSet;

import jdk.nashorn.api.tree.Tree;

class Solution {

    /**
     * 
     * again 1
     * 
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildBST(0,nums.length-1,nums);
    }  

    public TreeNode buildBST(int start,int end, int[] nums){
        if(start > end) return null;
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = buildBST(start, mid-1, nums);
        root.right = buildBST(mid+1, end, nums);
        return root;
    }

    /**
     * old
     */

    // public static void main(String[] args) {
    //     System.out.println("hello world");

    // }
    // public TreeNode sortedArrayToBST(int[] nums) {
    //     if(nums.length == 0)
    //         return null;
    //     return helper(nums, 0, nums.length - 1);
    // }
    
    // public TreeNode helper(int[] nums, int low, int high){
    //     if(low > high)
    //         return null;
    //     int mid = (low + high) / 2;
    //     TreeNode node = new TreeNode(nums[mid]);
    //     node.left = helper(nums, low, mid - 1);
    //     node.right = helper(nums, mid + 1, high);
    //     return node;
    // }

}



