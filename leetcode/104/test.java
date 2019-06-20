package test;

public class test {
	public static void main(String[] args) {
		
	}
    public int maxDepth(TreeNode root) {
        int res = 1;
    	return trackMaxDepth(root, res);
    }
    public int trackMaxDepth(TreeNode node,int res) {
    	int depth = res;
    	if(node == null) {
    		return 0;
    	}
    	else if(node.left == null && node.right == null) {
    		return depth;
    	}
    	else if(node.left != null || node.right != null) {
    		res++;
    		depth = Math.max(trackMaxDepth(node.left, res), trackMaxDepth(node.right, res));
    	}
    	return depth;
    }
}

