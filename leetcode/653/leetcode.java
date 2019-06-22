import java.util.ArrayList;
import java.util.List;

class leetcode {
    public static void main(String[] args) {

    }
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = trackTree(root);
        System.out.println(list);
        for(int i = 0;i < list.size();i++){
            int sum = list.get(i);
            for(int j = i+1;j < list.size() - 1;j++){
                sum += list.get(j);
                if(sum == k)
                    return true;
                sum = list.get(i);
            }
        }
        return false;        
    }
    public List<Integer> trackTree(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null)
            return res;
        res = trackTree(root.left);
        res.add(root.val);
        res = trackTree(root.right);
        return res;
    }
}