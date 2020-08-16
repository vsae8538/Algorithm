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

import jdk.nashorn.api.tree.Tree;

class Solution {

    public static void main(String[] args) {    
        
    }
    public int sumNumbers(TreeNode root) {
        if(root == null) return 0;
        List<String> list = new ArrayList<>();
        preOrder(root, list, new String(""));
        int res = 0;
        for(String s : list)
            res += Integer.valueOf(s);
        return res;
    }

    public void preOrder(TreeNode root, List<String> list, String s){
        if(root == null) return;

        s += String.valueOf(root.val);
        if(root.left == null && root.right == null){
            list.add(s);
            s = s.length() > 1 ? s.substring(0, s.length()-2) : ""; 
            return;
        }
        preOrder(root.left, list, s);
        preOrder(root.right, list, s);
    }
 
}
