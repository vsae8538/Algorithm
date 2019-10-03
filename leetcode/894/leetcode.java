import java.util.ArrayList;
import java.util.Arrays;
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
    public List<TreeNode> allPossibleFBT(int N) {
        if (N % 2 == 0) { //偶數不可能形成完滿樹
            return new ArrayList<>(0);
        }
        List<TreeNode> list = new ArrayList<>();
        if (N == 1) { //只有根節點
            list.add(new TreeNode(0));
            return list;
        }
        N--; //去除根節點
        for (int i = 1; i < N; i += 2) { //+2為奇數，每次循環構造一個完滿樹
            List<TreeNode> left = allPossibleFBT(i); //左節點
            List<TreeNode> right = allPossibleFBT(N - i); //右節點 = 所有樹節點 - 左節點 - 根節點 
            for (TreeNode l : left) { //構造樹節點
                for (TreeNode r : right) {
                    TreeNode node = new TreeNode(0); 
                    node.left = l;
                    node.right = r;
                    list.add(node);
                }
            }
        }
        return list;
    }
}

