import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class leetcode {
    public static void main(String[] args) {
        System.out.println('Z' - 'A');
    }
    List<String> list = new ArrayList<String>();
    public int sumRootToLeaf(TreeNode root) {
        dfs(root, "");
        int res = 0;
        for(String s : list){
            res += Integer.parseInt(s,2);
        }
        return res;
    }
    public void dfs(TreeNode root,String cur){
        if(root == null) return;
        if(root.left== null && root.right == null){
            list.add(cur + root.val);
        }
        if(root.left != null) dfs(root.left,cur + root.val);
        if(root.right != null) dfs(root.right, cur +root.val);
    }
}