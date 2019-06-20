import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class leetcode{
    public static void main(String[] args) {

    }
    public static List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<Integer>();
        track(root, result);
        return result;
    }

    public static void track(Node node,List<Integer> list){
        if(node == null){
            return;
        }
        for (Node n: node.children) {
            track(n,list);
        }
        list.add(node.val);
    }
}