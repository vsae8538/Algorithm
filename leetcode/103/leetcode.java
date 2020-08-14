import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

class leetcode {

    public static void main(String[] args) {    
        
    }

    /**
     *     0
     *    2   4
     *  1    3 -1
     * 5 1    6   8
     */
    /*
        BFS
    */
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) 
            return res;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean order = true;
        int size = 1;
    
        while(!q.isEmpty()) {
            List<Integer> tmp = new ArrayList<>();
            for(int i = 0; i < size; ++i) {
                TreeNode n = q.poll();
                if(order) {
                    tmp.add(n.val); //加入末端
                } else {
                    tmp.add(0, n.val); //從前端加入
                }
                if(n.left != null) q.add(n.left);
                if(n.right != null) q.add(n.right);
            }
            res.add(tmp);
            size = q.size();
            order = !order;
        }

        return res;
    }

     /* 
        未完成
     */
    // List<List<Integer>> res = new ArrayList<>(); 
    // public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    //     if(root == null)
    //         return res;
    //     List<Integer> list = new ArrayList<>();
    //     list.add(root.val);
    //     res.add(list);
    //     Map<Integer,List<Integer>> map = new HashMap<>();
    //     preOrder(root,0, map);
    //     return res;
    // }

    // public void preOrder(TreeNode root,int dp,Map<Integer,List<Integer>> map){
    //     if(root == null){
    //         return;
    //     }
    //     List<Integer> list;
    //     if(map.get(dp) != null){
    //         list = map.get(dp);
    //     }else{
    //         list = new ArrayList<Integer>();
    //         map.put(dp, list);
    //     }
        
    //     if(dp % 2 == 0){
    //         if(root.right != null)
    //             list.add(root.right.val);
    //         if(root.left != null)
    //             list.add(root.left.val);
    //     }else{
    //          if(root.left != null)
    //             list.add(root.left.val);
    //          if(root.right != null)
    //             list.add(root.right.val);
    //     }

    //     if(list.size() > 0 && !res.contains(list))
    //         res.add(list);

    //     preOrder(root.left, dp+1, map);
    //     preOrder(root.right, dp+1, map);
    // }
}

