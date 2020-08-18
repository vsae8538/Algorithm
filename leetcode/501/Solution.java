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

    public static void main(String[] args) {    
    }

    Map<Integer,Integer> map = new HashMap<>();
    public int[] findMode(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return new int[0];
        preorder(root);
        int maxVal = 1;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) 
            if(maxVal < e.getValue()) maxVal = e.getValue();

        for (Map.Entry<Integer, Integer> e : map.entrySet()) 
            if(e.getValue() == maxVal) list.add(e.getKey());   

        int[] res = new int[list.size()];
        for(int i = 0;i < list.size();i++) 
            res[i] = list.get(i);
        
        return res;
    }

    public void preorder(TreeNode root){
        if(root == null) return;
        if(map.containsKey(root.val)){
            map.put(root.val, map.get(root.val)+1);
        }else{
            map.put(root.val, 1);
        }
        preorder(root.left);        
        preorder(root.right);
    }
}
