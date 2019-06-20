package test;


public class test {
	public static void main(String[] args) {
		
	}
    public TreeNode insertIntoBST(TreeNode root, int val) {
    	if(root == null) return new TreeNode(val);
        TreeNode pt = root;
        while(pt != null) {
        	if(pt.val > val) {
        		if(pt.left != null)
        			pt = pt.left;
        		else {
        			pt.left = new TreeNode(val);
        			break;
        		}
        	}
        	else if(pt.val < val){
        		if(pt.right != null)
        			pt = pt.right;
        		else {
        			pt.right = new TreeNode(val);
        			break;
        		}
        	}
        }
        
        return root;
    }
}


