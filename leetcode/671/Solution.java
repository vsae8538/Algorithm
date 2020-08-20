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
import java.util.Stack;

class Solution {

    List<Integer> list;
    public int findSecondMinimumValue(TreeNode root) {
        if(root == null) return -1;
        list = new LinkedList<>();
        postorder(root);
        Collections.sort(list);
        if(list.size() > 1 && (list.get(0) < list.get(1)))
            return list.get(1);
        else if(list.size() == 1)
            return list.get(0);
        return -1;  
    }

    public void postorder(TreeNode root){
        if(root == null) return;
        postorder(root.left);
        if(!list.contains(root.val)) list.add(root.val);
        postorder(root.right);
    }

}
