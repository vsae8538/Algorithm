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

class Solution {

    public static void main(String[] args) {    
    }

    List<Integer> list;
    public int kthSmallest(TreeNode root, int k) {
        if(root == null) return 0;
        list = new ArrayList<>();
        preOrder(root);
        return list.get(k);
    }

    public void preOrder(TreeNode node){
        if(node == null) return;
        preOrder(node.left);
        list.add(node.val);
        preOrder(node.right);
    }
}
