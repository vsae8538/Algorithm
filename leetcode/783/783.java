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
    public int minDiffInBST(TreeNode root){
        if(root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node.left != null) queue.offer(node.left);
            if(node.right != null) queue.offer(node.right);
            list.add(node.val);
        }
        for(int i = 0;i < list.size() - 1;i++){
            for(int j = i + 1;j < list.size();j++){
                int sub = list.get(i) - list.get(j);
                min = Math.min(Math.abs(sub), min);
            }
        }
        return min;
    }

}

