import java.util.ArrayList;
import java.util.List;

class leetcode {
    public static void main(String[] args) {
   
    }   
    public TreeNode invertTree(TreeNode root) {
        trackInvertTree(root);
        return root;
    }
    public void trackInvertTree(TreeNode node){
        if(node == null){
            return;
        }
        if(node.left != null && node.right != null){
            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;
        }
        else if(node.left != null && node.right == null){
            node.right = node.left;
            node.left = null;
        }
        else if(node.left == null && node.right != null){
            node.left = node.right;
            node.right = null;
        }
        trackInvertTree(node.left);
        trackInvertTree(node.right);
    }
}
