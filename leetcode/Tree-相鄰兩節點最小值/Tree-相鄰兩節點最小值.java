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
        System.out.println("Hello World\n");
    }
 
    /* 相鄰兩節點最小值(距離) */
    public int minDiffInBST(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        int min = Integer.MAX_VALUE;
        queue.offer(root);
        while(!queue.isEmpty()){
            int[] arr = new int[2]; 
            TreeNode node = queue.poll();
            if(node.left == null & node.right == null) 
                continue;
            if(node.left != null){
                queue.offer(node.left);
                arr[0] = node.left.val;
            }
            if(node.right != null){
                queue.offer(node.right);
                arr[1] = node.right.val;
            }
            for(int i = 0;i < 2;i++){
                min = Math.min(Math.abs(node.val - arr[i]), min);
            }
        }
        return min;
    }
}

