
class leetcode {
    public static void main(String[] args) {

    }
    public int sum = 0;
    public int rangeSumBST(TreeNode root, int L, int R) {
        preOrderTrackTree(root,L,R);
        return sum;
    }
    public void preOrderTrackTree(TreeNode node,int L,int R){
        if(node == null)
            return;
        if(node.val <= R && node.val >= L){
            sum += node.val;
            System.out.println(sum);
        }
        preOrderTrackTree(node.left,L,R);
        preOrderTrackTree(node.right,L,R);
    }
}
