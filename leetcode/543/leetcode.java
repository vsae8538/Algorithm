import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

class leetcode {
    public static void main(String[] args) {    
        
    }
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        track(root);
        return max;
    }

    public void track(TreeNode node){
        calculate(node);
    }

    public int calculate(TreeNode node){
        if(node == null) 
            return 0;
        int ldep = calculate(node.left);
        int rdep = calculate(node.right);
        max = Math.max(max , ldep + rdep);
        return Math.max(ldep, rdep) + 1;
    }
}

