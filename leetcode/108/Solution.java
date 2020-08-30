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

}



