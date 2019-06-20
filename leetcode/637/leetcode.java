import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class leetcode {
    public static void main(String[] args) {

    }
    public List<Double> averageOfLevels(TreeNode root) {
        if(root == null)
            return null;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<Double> res = new ArrayList<Double>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<TreeNode> list = new ArrayList<TreeNode>();
            while(!queue.isEmpty())
                list.add(queue.poll());
            for(int i = 0;i < list.size();i++){
                TreeNode pt = list.get(i);
                if(pt.left != null){
                    queue.offer(pt.left);
                }
                if(pt.right != null){
                    queue.offer(pt.right);
                }
            }
            double avg = list.size();
            double sum = 0;
            for(int i = 0;i < list.size();i++){
                sum += list.get(i).val;
            }
            double num = sum / avg;
            res.add(num);
        }
        return res;
    }
}
