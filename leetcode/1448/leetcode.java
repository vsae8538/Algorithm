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

    public int goodNodes(TreeNode root) {
        return goodNodes(root, -10000);
    }

    public int goodNodes(TreeNode node, int max){
        if(node == null){
            return 0;
        }
        int res = node.val >= max ? 1:0;
        res += goodNodes(node.left, Math.max(node.val, max)); 
        res += goodNodes(node.right, Math.max(node.val, max));
        
        return res;
    }

}

