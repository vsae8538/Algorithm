import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

class leetcode {
    public static void main(String[] args) {
        System.out.println('Z' - 'A');
    }
    List<TreeNode> list = new ArrayList<>(); //於leetcode 不要使用靜態變數
    public TreeNode convertBST(TreeNode root) {
        postOrder(root);
        int n = 0;
        for(int i = 0;i < list.size();i++){
            TreeNode t = list.get(i);
            t.val += n;
            n = t.val;
        }
        return root;
    }
    public void postOrder(TreeNode node){
        if(node == null) return;
        postOrder(node.right);
        list.add(node);
        postOrder(node.left);
    }
}