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

    /**
     * 3 1 2
        r1: y = 1 x = 3
         
     */
    
    List<Integer> list = new ArrayList<>();
    public void recoverTree(TreeNode root) {
        if(root == null) return;
        inOrder(root);
        int[] swap = swapNode(list);
        recoverTree(root, swap[0], swap[1]);
    }

    public int[] swapNode(List<Integer> list){
        int x = -1, y = -1;
        for(int i = 0;i < list.size() - 1;i++){
            if(list.get(i+1) < list.get(i)){
                y = list.get(i+1);
                if(x == -1){
                    x = list.get(i);
                }else{
                    break;
                }
            }
        }
        return new int[]{x,y};
    }

    public void recoverTree(TreeNode root,int x,int y){
        if(root == null){
            return;
        }
        if(root.val == x || root.val == y){
            root.val = root.val == x ? y : x;
        }
        recoverTree(root.left, x, y);
        recoverTree(root.right, x, y);
    }

    public void inOrder(TreeNode root){
        if(root == null){
            return;   
        }
        inOrder(root.left); 
        list.add(root.val);
        inOrder(root.right);
    } 
}

