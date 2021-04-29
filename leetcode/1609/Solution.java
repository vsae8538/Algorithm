import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;

import javax.swing.tree.TreeNode;


class Solution{

    /**
     * [11,18,14,3,7,null,null,null,null,18,null,6]
     *        11
     *    18       14
     *  3    7    n     n
     * n n 18 n 6
     */

    public boolean isEvenOddTree(TreeNode root) {
        if(root == null) return false;

        Queue<TreeNode> queue = new LinkedList();
        int level = 0;

        queue.offer(root);
       

        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0;i < size;i++){
                TreeNode node = queue.poll();  
                list.add(node.val);
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
            }     
 //System.out.println(list );
            if(list.size() == 1){
                if(level % 2 == 0 && list.get(0) % 2 == 0) 
                    return false;
                else if(level % 2 == 1 && list.get(0) % 2 == 1){
                    return false;
                }
                level++;
                continue;
            }

            for(int i = 0;i < list.size() -1;i++){
                int n = list.get(i);
                int m = list.get(i+1);
                if(level % 2 == 0){
                    if(n >= m || n % 2 != 1 || m % 2 != 1){
                        return false;
                    }
                }else{
                    if(n <= m  || n % 2 != 0 || m % 2 != 0){
                        return false;
                    }
                }
            }

            level++;
        }


        return true;
    }

}
