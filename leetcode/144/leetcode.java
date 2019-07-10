import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class leetcode {
    public static void main(String[] args) {
        System.out.println('Z' - 'A');
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> list = new ArrayList<Integer>();
        if(root != null){
            stack.push(root);
            while(!stack.isEmpty()){
                TreeNode node = stack.pop();
                list.add(node.val);
                if(node.right != null) stack.push(node.right);
                if(node.left != null) stack.push(node.left);
            }
        }
        return list;
    }
}