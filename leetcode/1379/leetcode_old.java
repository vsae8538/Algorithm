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

class leetcode {


    public static void main(String[] args) {    

    }
    /**
     *  BFS only fast 5 %
     */
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        Queue<TreeNode> oQueue = new LinkedList<>();
        Queue<TreeNode> cQueue = new LinkedList<>();
        oQueue.offer(original);
        cQueue.offer(cloned);
        while(!cQueue.isEmpty()){
            TreeNode oNode = oQueue.poll();
            TreeNode cNode = cQueue.poll();
            if(oNode.val == cNode.val && oNode.val == target.val){
                return cNode;
            }
            if(oNode.left != null) oQueue.offer(oNode.left);
            if(oNode.right != null) oQueue.offer(oNode.right);
            if(cNode.left != null) cQueue.offer(cNode.left);
            if(cNode.right != null) cQueue.offer(cNode.right);
        }
        return null;
    }

}

