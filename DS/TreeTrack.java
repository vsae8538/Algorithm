import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

/*
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
    TreeNode(){}
}
*/


public class TreeTrack {
    

    public void BFS(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0;i < size;i++){
                TreeNode node = queue.poll();
                System.out.print(node.val + " ");
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);                
            }
        }
    }

    public void DFS(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            System.out.print(node.val + " ");
            if(node.right != null) stack.push(node.right);
            if(node.left != null) stack.push(node.left);
        }
    }

    public void preorder(TreeNode node){
        if(node == null){
            return ;
        }
        System.out.print(node.val + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public void inorder(TreeNode node){
        if(node == null){
            return ;
        }
        inorder(node.left);
        System.out.print(node.val + " ");
        inorder(node.right);
    }

    public void postorder(TreeNode node){
        if(node == null){
            return ;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.val + " ");
    }
    
}
