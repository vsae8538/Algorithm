import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

class leetcode {
    public static void main(String[] args) {
        System.out.println("hello world");

    }

    List<Integer> list = new ArrayList<Integer>();
    public int getMinimumDifference(TreeNode root) {
        int min = Integer.MAX_VALUE;
        trackTree(root);
        for(int i = 0;i < list.size();i++){
            for(int j = 0;j < list.size();j++){
                if(i == j) continue;
                int n = list.get(i) - list.get(j);
                min = Math.min(min, Math.abs(n));
            }    
        }
        return min;
    }

    public void trackTree(TreeNode node){
        if(node == null) return;
        list.add(node.val);
        trackTree(node.left);
        trackTree(node.right);
    }
}   
