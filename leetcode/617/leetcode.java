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

class leetcode {


    public static void main(String[] args) {    

    }
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 != null){
            t1 = new TreeNode(0);
        }
        else if(t1 == null && t2 == null){
            return t1;
        }
        sumTree(t1, t2);
        return t1;
    }

    public void sumTree(TreeNode t1,TreeNode t2){
        if(t2 == null)
            return;
        else if(t1 == null && t2 == null)
            return;

        t1.val += t2.val;
        
        if(t2 != null){
            if(t1.left == null && t2.left != null){
                t1.left = new TreeNode(0);
            }
            if(t1.right == null && t2.right != null){
                t1.right = new TreeNode(0);
            }
        }

        sumTree(t1.left, t2.left);
        sumTree(t1.right, t2.right);
    }
}

