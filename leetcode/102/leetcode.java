import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

class leetcode {
    public static void main(String[] args) {
        System.out.println('Z' - 'A');
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        if(root == null) return res;
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            while(!queue.isEmpty()){
                TreeNode t = queue.poll();
                queue2.add(t);
            }
            while(!queue2.isEmpty()){
                TreeNode t = queue2.poll();
                if(t.left != null) queue.add(t.left);
                if(t.right != null) queue.add(t.right);
                list.add(t.val);
            }
            res.add(list);
        }
        return res;
    }

}