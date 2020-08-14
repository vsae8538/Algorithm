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
import java.util.Stack;

class leetcode {


    public static void main(String[] args) {    
        
    }
    public List<TreeNode> generateTrees(int n) {
        if(n < 1){
            return new LinkedList<TreeNode>();
        }
        return generateTreesList(1,n);
    }
    public List<TreeNode> generateTreesList(int start, int end){
        List<TreeNode> list = new LinkedList<>();
        if(start > end){
            list.add(null);
            return list;
        }

        for(int i = start;i <= end;i++){
            List<TreeNode> left = generateTreesList(start, i-1);
            List<TreeNode> right = generateTreesList(i+1, end);
            for(TreeNode  l : left){
                for(TreeNode r : right){
                    TreeNode root = new TreeNode(i);
                    root.left = l;
                    root.right = r;
                    list.add(root);
                }
            }
        }
        

        return list;
    }
}

