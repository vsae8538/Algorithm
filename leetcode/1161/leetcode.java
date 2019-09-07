import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

class leetcode {
    public static void main(String[] args) {
        System.out.println('Z' - 'A');
    }
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        int max = root.val, res = 1,dep = 0;
        queue.offer(root);
        while(!queue.isEmpty()){
            dep++;
            int cnt = 0;
            int size = queue.size();
            while(size-- > 0){
                TreeNode t = queue.poll();  
                cnt += t.val;
                if(t.left != null) queue.offer(t.left);
                if(t.right != null) queue.offer(t.right);
            }
            if(max < cnt){
                max = cnt;
                res = dep;
            }
        }
        return res;
    }
}