package test;

import java.util.Arrays;


public class test {
	public static void main(String[] args) {
		
	}
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode result = root;
        while(result != null) {
        	if(result.val == val)
        		return result;
        	else if(result.val < val) {
        		result = result.right;
        	}
        	else {
        		result = result.left;
        	}
        }
        return null;
    }
}

