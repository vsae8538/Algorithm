import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;

class Solution{ 

    /**
     * BFS
     */
    Map<TreeNode, TreeNode> parent;
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        parent = new HashMap<>();
        dfs(root, null);
        Queue<TreeNode> queue = new LinkedList();
        queue.add(null);
        queue.add(target);

        Set<TreeNode> seen = new HashSet();
        seen.add(target);
        seen.add(null);

        int dist = 0;
        while(!queue.isEmpty()){
            TreeNode n = queue.poll();
            if(n == null){
                if(dist == K){
                    List<Integer> res = new ArrayList();
                    for (TreeNode t: queue)
                        res.add(t.val);
                    return res;
                }
                queue.offer(null); //每次dist=x時的所有節點
                dist++;
            }else{
                if (!seen.contains(n.left)) {
                    seen.add(n.left);
                    queue.offer(n.left);
                }
                if (!seen.contains(n.right)) {
                    seen.add(n.right);
                    queue.offer(n.right);
                }
                TreeNode par = parent.get(n);
                if (!seen.contains(par)) {
                    seen.add(par);
                    queue.offer(par);
                }
            }
            return new LinkedList<>();
        }

    }

    public void dfs(TreeNode node, TreeNode par){
        if(node == null) return;
        parent.put(node, par);
        dfs(node.left, node);
        dfs(node.right, node);
    }

    /**
     * DFS + BFS + 圖
     * 理論上可過,測資有疑問
     */
    // boolean[] visited;
    // public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {        
    //     Map<Integer,List<Integer>> map = new HashMap<>();
    //     List<Integer> res = new ArrayList<>();
    //     if(root == null || target == null) return res;
    //     else if(K == 0){
    //         res.add(target.val);
    //         return res;
    //     }

    //     int len = count(root);
    //     if(len < K){
    //         return res;
    //     }

    //     for(int i = 0;i < len;i++) map.put(i, new LinkedList<>());
        
    //     bfs(map, root);

    //     visited = new boolean[len+1];
    //     visited[target.val] = true;
    //     for(Integer i : map.get(target.val)){
    //         dfs(map, i, res, 1, K);
    //     }
        
    //     return res;
    // }

    // public int count(TreeNode root){
    //     if(root == null) return 0;
    //     return count(root.left) + count(root.right) + 1;
    // }

    // public void dfs(Map<Integer,List<Integer>> map, Integer n, List<Integer> res, int start, int K){
    //     if(start >= K){
    //         if(!visited[n]){
    //             res.add(n);
    //             visited[n] = true;
    //         }
    //         return;
    //     }

    //     visited[n] = true;
    //     for(Integer i : map.get(n)){
    //         dfs(map, i, res, start+1, K);
    //     }
    // }

    // public void bfs(Map<Integer,List<Integer>> map, TreeNode root){
    //     Queue<TreeNode> queue = new LinkedList<>();
    //     queue.offer(root);
    //     while(!queue.isEmpty()){
    //         TreeNode n = queue.poll();
    //         List<Integer> list = map.get(n.val);
    //         if(n.left != null){
    //             list.add(n.left.val);
    //             map.get(n.left.val).add(n.val);
    //             queue.add(n.left);
    //         }
    //         if(n.right != null){
    //             list.add(n.right.val);
    //             map.get(n.right.val).add(n.val);
    //             queue.add(n.right);
    //         }
    //     }
    // }

}