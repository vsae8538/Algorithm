package test;

import java.util.Arrays;


public class test {
	public static void main(String[] args) {
		
	}
    public static boolean isUnivalTree(TreeNode root) {
        return TreeFunc(root, root.val);
    }
    public static boolean TreeFunc(TreeNode treeNode,int val) {
    	if(val != treeNode.val)
        	return false;
    	boolean left = true;
    	if(treeNode.left != null)
    		left = TreeFunc(treeNode.left, val);
    	boolean right = true;
    	if(treeNode.right != null)
    		right = TreeFunc(treeNode.right, val);
    	return (left == true) && (right == true); 
    }
}

