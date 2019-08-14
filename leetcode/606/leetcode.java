import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

class leetcode {
    public static void main(String[] args) {
        System.out.println('Z' - 'A');
    }
    public String tree2str(TreeNode t) {
        if(t == null) return "";
        String res = t.val + "";
        String left = tree2str(t.left);
        String right = tree2str(t.right);
        if(left == "" && right == "") return res;
        else if(left == "") return res + "()" + "(" + right + ")";
        else if(right == "") return res + "(" + left + ")";
        else{ return res + "(" + left + ")" + "(" + right + ")";} 
    }
}