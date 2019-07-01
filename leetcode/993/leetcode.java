

class leetcode {
    public static void main(String[] args) {
        System.out.println("hello world");
    } 

    boolean b = true;
    int dep = 0;
    public boolean isCousins(TreeNode root, int x, int y) {
        trackTree(root, x, 0);
        int xdep = dep;
        trackTree(root, y, 0);
        isDiffPaPa(root, x, y);
        System.out.println(xdep + " " + dep + " " + b);
        return (dep == xdep) && b;  
    }

    public void trackTree(TreeNode root, int n, int dp){
        if(root == null)
            return;
        if(root.val == n){
            dep = dp;
            return;
        }
        dp++; 
        trackTree(root.left, n, dp);
        trackTree(root.right, n, dp);
    }
    public void isDiffPaPa(TreeNode root, int x, int y){
        if(root == null){
            return;
        }
        if(root.left != null && root.right != null){
            if(root.left.val == x && root.right.val == y){
                b = false;
                return;
            }
            else if(root.right.val == x && root.left.val == y){
                b = false;
                return;
            }
        }
        isDiffPaPa(root.left, x, y);
        isDiffPaPa(root.right, x, y);
    }
}
