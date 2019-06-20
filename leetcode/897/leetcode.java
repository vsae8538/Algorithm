import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class leetcode{
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        List<Integer> list = new ArrayList<Integer>();
        trackAllNode(node, list);
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);
    }
    public static TreeNode increasingBST(TreeNode root) {
        if(root == null)
            return null;
        List<Integer> list = new ArrayList<Integer>();
        list = new ArrayList<Integer>();
        trackAllNode(root, list);
        Collections.sort(list);
        
        TreeNode result = new TreeNode();
        int i = 0;
        TreeNode pt = result;
        while(i < list.size()){
            pt.val = list.get(i);
            i++;
            if(i < list.size()){
                pt.left = null;
                pt.right = new TreeNode();
                pt = pt.right;
            }
        }
        return result;
    }

    public static void trackAllNode(TreeNode node, List<Integer> list){
        if(node == null){
            return;
        }
        trackAllNode(node.left, list);
        list.add(node.val);
        trackAllNode(node.right, list);
    }
}