import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

class leetcode {
    public static void main(String[] args) {
        
    }
    /**
     * BFS 執行佚代時,每經歷過一個階層便將res設為0,直到找到最深階層時,直接加總即可
     */
    public int deepestLeavesSum(TreeNode root) {
        int res = 0, i;
        LinkedList<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while (!q.isEmpty()) {
            for (i = q.size() - 1, res = 0; i >= 0; --i) {
                TreeNode node = q.poll();
                res += node.val;
                if (node.right != null) q.add(node.right);
                if (node.left  != null) q.add(node.left);
            }
        }
        return res;
    }

}   