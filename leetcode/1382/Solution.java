import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;

import jdk.nashorn.api.tree.Tree;

class Solution {
    /**
     * 二分 + 中序 建立AVL樹
     */
    List<Integer> sortedNodes = new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        inOrder(root);
        return buildAVLTree(0, sortedNodes.size());
    }
    
    public void inOrder(TreeNode root){
        if(root == null) return;
        inOrder(root.left);
        sortedNodes.add(root.val);
        inOrder(root.right);
    }

    public TreeNode buildAVLTree(int start, int end){
        if(start > end) return null;
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(sortedNodes.get(mid));
        root.left = buildAVLTree(start, mid-1);
        root.right = buildAVLTree(mid+1, end);
        return root;
    }

}



