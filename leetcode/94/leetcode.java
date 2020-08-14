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
    List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inOrderTrack(root);
        return list;
    }
    public void inOrderTrack(TreeNode root){
        if(root == null){
            return;
        }
        inOrderTrack(root.left);
        list.add(root.val);
        inOrderTrack(root.right);
    }
}

