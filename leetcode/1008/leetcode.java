
class leetcode {
    public static void main(String[] args) {

    }
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = createBinaryTree(preorder);
        return preOrderConstruct(root);
    }
    public TreeNode createBinaryTree(int[] preorder) {
        if(preorder.length == 0){
            return null;
        }
        TreeNode tr = new TreeNode(preorder[0]);
        for(int i = 1;i < preorder.length;i++){
            TreeNode pt = tr;
            while(pt != null){
                if(preorder[i] >= pt.val){
                    if(pt.right != null){
                        pt = pt.right;
                    }else{
                        pt.right = new TreeNode(preorder[i]);
                        break;
                    }
                }else{
                    if(pt.left != null){
                        pt = pt.left;
                    }else{
                        pt.left = new TreeNode(preorder[i]);
                        break;
                    }
                }
            }
        }
        return tr;
    }

    public TreeNode preOrderConstruct(TreeNode node){
        if(node == null){
            return null;
        }
        TreeNode res = new TreeNode(node.val);
        res.left = preOrderConstruct(node.left);
        res.right = preOrderConstruct(node.right);
        return res;
    } 
}
