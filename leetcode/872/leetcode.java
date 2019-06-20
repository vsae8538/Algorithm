import java.util.ArrayList;
import java.util.List;

class leetcode {
    public static void main(String[] args) {

    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
       List<Integer> list = new ArrayList<Integer>();
       List<Integer> list2 = new ArrayList<Integer>();
       preOrder(root1, list); 
       preOrder(root2, list2);
       if(list.equals(list2))
            return true;
        return false;
    }
    public void preOrder(TreeNode node,List<Integer> list){
        if(node == null){
            return;
        }
        if(node.left == null && node.right == null){
            list.add(node.val);
        }
        preOrder(node.left, list);
        preOrder(node.right, list);
    }
}