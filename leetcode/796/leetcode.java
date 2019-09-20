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
        Queue<Character> queue = new LinkedList<>();
        queue.offer('a');queue.offer('b');queue.offer('c');
        for(char c : queue) System.out.println();
    }
    
    /**
     * 思路：首先確認兩個字符串的長度要相等。其次只要保證A + A的字符串中包含B就可以了。因為A + A已經包含了所有可移動的方案。
     */
    public boolean rotateString(String A, String B) {
        return A.length() == B.length() && (A+A).contains(B);
    }

}

