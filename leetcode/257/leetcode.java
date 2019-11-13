import java.util.ArrayList;
import java.util.Arrays;
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
        System.out.print("Hello World\n");
    }
    List<String> answer = new ArrayList<String>();
    public List<String> binaryTreePaths(TreeNode root) {
        if (root != null) searchBT(root, "");
        return answer;
    }
    private void searchBT(TreeNode root, String path) {
        if (root.left == null && root.right == null) answer.add(path + root.val);
        if (root.left != null) searchBT(root.left, path + root.val + "->");
        if (root.right != null) searchBT(root.right, path + root.val + "->");
    }
}

