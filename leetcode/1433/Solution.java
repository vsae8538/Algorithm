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


    /**
     * 
     * 兩陣列中只要有一個數比另一個陣列的數小,則false
     * 先排序再比較大小。比較大小時，換位置比較兩次，如果兩次都不是遞增的，那麼就假，只要滿足一次遞增的，就對。
     */
    public boolean checkIfCanBreak(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);    
        Arrays.sort(c2);
        int count=0;
        while (count < c1.length && c1[count]-c2[count] >= 0) {
            count++;
        }
        if (count == c1.length) {
            return true;
        }
        count=0;
        while (count < c2.length && c2[count] - c1[count] >=0) {
            count++;
        }
        if (count == c2.length) {
            return true;
        }
        return false;
    }


}
