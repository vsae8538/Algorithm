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
        System.out.print("Hello World\n");
    }

    TreeNode root;
    int pt;
    int size;
    List<Integer> list;
    public BSTIterator(TreeNode root) {
        if(root == null) return;
        this.root = root;
        pt = 0;
        list = new ArrayList<>();
        inOrder(root);
        size = list.size();
    }
    
    public void inOrder(TreeNode root){
        if(root == null) return;
        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
    }

    /** @return the next smallest number */
    public int next() {
        return list.get(pt++);
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if(pt == size){
            return false;
        }
        return true;
    }

}
