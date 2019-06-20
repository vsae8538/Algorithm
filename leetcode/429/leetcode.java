import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


class leetcode {
    public static void main(String[] args) {
     
    }
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Queue<Node> queue = new LinkedList<Node>();
        if(root == null)
            return res;
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> valList = new ArrayList<Integer>();
            int len = queue.size();
            for(int i = 0;i <len;i++){
                Node curr = queue.poll();
                valList.add(curr.val);
                for(Node node:curr.children){
                    queue.offer(node);
                }
            }
            res.add(valList);
        }
        return res;
    }

}
