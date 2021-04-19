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

class Solution{
    /**
     * 
     *  若是偽回文,則最多只有一個數為奇數
     *  使用Set去除偶數,若size <= 1 則必然有一數為奇數,此為 偽回文
     * @param root
     * @return
     */

    public int pseudoPalindromicPaths (TreeNode root) {
        return dfs(root, new HashSet());
    }
    
    private int dfs(TreeNode node, Set<Integer> numbers){
        if(node == null) return 0;
        if(numbers.contains(node.val)) 
            numbers.remove(node.val);
        else 
            numbers.add(node.val);

        if(node.left==null&& node.right==null){
            return numbers.size() <= 1 ? 1 : 0;
        }

        int left = dfs(node.left, new HashSet(numbers));
        int right = dfs(node.right, new HashSet(numbers));

        return left+right;
    }
}
