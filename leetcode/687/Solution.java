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
import java.util.Stack;

class Solution {


    /**
     * [5,5,1,5,5,2,3,5,1,5,1,4,5,6,7]：

             3    5
              /     \
           2 5         1
           / \      /  \ 
    1   [5] 1[5]   2    3
        / \  / \   / \  / \ 
   0   [5]1 0[5] 1 4  5 6  7

        result:4

     */
    int ans;
    public int longestUnivaluePath(TreeNode root) {
        ans = 0;
        arrowLength(root);
        return ans;
    }
    public int arrowLength(TreeNode node) {
        if (node == null) return 0;
        int left = arrowLength(node.left);
        int right = arrowLength(node.right);
        int arrowLeft = 0, arrowRight = 0;
        if (node.left != null && node.left.val == node.val) {
            arrowLeft = left + 1;
        }
        if (node.right != null && node.right.val == node.val) {
            arrowRight = right + 1;
        }
        ans = Math.max(ans, arrowLeft + arrowRight);
        return Math.max(arrowLeft, arrowRight);
    }
}
