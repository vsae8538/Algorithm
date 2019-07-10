import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class leetcode {
    public static void main(String[] args) {
        System.out.println("hello world");

    } 
    public TreeNode bstToGst(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        trackTree(root, queue);
        int cur = 0;
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            node.val += cur;
            cur = node.val;
        }
        return root;
    }
    public void trackTree(TreeNode root,Queue queue){
        if(root == null){
            return;
        }
        trackTree(root.right, queue);
        queue.offer(root);
        trackTree(root.left, queue);
    }
}
