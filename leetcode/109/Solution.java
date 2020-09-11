import java.lang.reflect.Array;
import java.math.BigInteger;
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


class Solution {

    /**
     * 二分     -> build AVL BST 
     * 快慢指針 -> 取鏈表中間
     * 
     * faster then 100%
     */
    public TreeNode sortedListToBST(ListNode head) {
        return buildTree(head, null); //左開右閉 -> 單鏈表,無法訪問上一個節點
    }

    public TreeNode buildTree(ListNode left, ListNode right) {
        if (left == right) {
            return null;
        }
        ListNode mid = getMedian(left, right);
        TreeNode root = new TreeNode(mid.val);
        root.left = buildTree(left, mid);
        root.right = buildTree(mid.next, right);
        return root;
    }

    public ListNode getMedian(ListNode left, ListNode right) {
        ListNode fast = left;
        ListNode slow = left;
        while (fast != right && fast.next != right) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }


    // /**
    //  * 二分  
    //  * faster then 5%
    //  */
    // public TreeNode sortedListToBST(ListNode head) {
    //     List<Integer> list = new ArrayList<>();
    //     for(ListNode pt = head;pt != null;pt = pt.next) list.add(pt.val);
    //     return buildBST(0, list.size()-1, list.stream().mapToInt(i->i).toArray());
    // }

    // public TreeNode buildBST(int left,int right,int[] nums){
    //     if(left > right) return null;
    //     int mid = (left + right) / 2;
    //     TreeNode root = new TreeNode(nums[mid]);
    //     root.left = buildBST(left, mid-1, nums);
    //     root.right = buildBST(mid+1, right, nums);
    //     return root;
    // }

}



