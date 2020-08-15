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
    private Map<Integer, Integer> indexMap;

    private TreeNode buildTree(int[] preorder, int[] indorder, int pre_left, int pre_right, int in_left, int in_right){
        if(pre_left > pre_right){
            return null;
        }

        int pre_root = pre_left;
        int inorder_root_index = indexMap.get(preorder[pre_root]);
        TreeNode root = new TreeNode(preorder[pre_root]);
        int left_subTree_size = inorder_root_index - in_left;

        root.left = buildTree(preorder, indorder, pre_left + 1, pre_left + left_subTree_size, in_left, inorder_root_index - 1);
        root.right = buildTree(preorder, indorder, pre_left + left_subTree_size + 1, pre_right, inorder_root_index + 1, in_right);
        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        indexMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            indexMap.put(inorder[i], i);
        }
        return buildTree(preorder, inorder, 0, n - 1, 0, n - 1);

    }
}
