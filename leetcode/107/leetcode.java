import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

class leetcode {
    public static void main(String[] args) {    
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(null);
        System.out.print("Hello World \n");
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        
        if(root == null)
            return res;
        else 
            queue.offer(root);

        while(!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int n = 0;
            int len = queue.size();
            while(n++ < len){
                TreeNode t = queue.poll();
                if(t.left != null) queue.offer(t.left);
                if(t.right != null) queue.offer(t.right);
                list.add(t.val);
            }
            res.add(list);
        }
        Collections.reverse(res);
        return res;
    }
}

