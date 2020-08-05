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

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(original == null){
            return null;
        }
        if(original == target){
            return cloned;
        }
        TreeNode res = getTargetCopy(original.left, cloned.left, target);
        if(res != null){
            return res;
        }
        res = getTargetCopy(original.right, cloned.right, target);
        if(res != null){
            return res;
        }
        return null;
    }

}

