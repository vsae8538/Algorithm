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
    int ans = 0;
    public int findTilt(TreeNode root) {
        if(root == null) return 0;
        sumTree(root);
        return ans;
    }
    public int sumTree(TreeNode root){
        if(root == null) return 0;
        int lnum = sumTree(root.left);
        int rnum = sumTree(root.right);
        ans += Math.abs(lnum - rnum);
        return root.val + lnum + rnum;
    }
}
