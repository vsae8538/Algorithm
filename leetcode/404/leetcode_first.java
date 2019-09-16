import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

class leetcode {
    public static void main(String[] args) {

    }
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        int res = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode t = queue.poll();
            if(t.left != null){
                queue.offer(t.left);
                TreeNode temp = t.left;
                if(temp.left == null && temp.right == null){
                    res += temp.val;
                }
            }
            if(t.right != null) queue.offer(t.right);
        }
        return res;
    }
}

