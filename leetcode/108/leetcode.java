import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

class leetcode {
    public static void main(String[] args) {
        System.out.println("hello world");

    }
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0)
            return null;
        return helper(nums, 0, nums.length - 1);
    }
    
    public TreeNode helper(int[] nums, int low, int high){
        if(low > high)
            return null;
        int mid = (low + high) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums, low, mid - 1);
        node.right = helper(nums, mid + 1, high);
        return node;
    }
}       
