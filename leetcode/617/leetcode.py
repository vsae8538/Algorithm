class Solution:
    def mergeTrees(self, t1: TreeNode, t2: TreeNode) -> TreeNode:
        if not t1 and not t2:
            return
        if not t1:
            res = t2
        elif not t2:
            res = t1
        else:
            res = TreeNode(t1.val+t2.val)
            res.left = self.mergeTrees(t1.left,t2.left)
            res.right = self.mergeTrees(t1.right,t2.right)
        
        return res
    