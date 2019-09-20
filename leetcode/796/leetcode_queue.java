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
    
    public boolean rotateString(String A, String B) {
        if(A.equals("") && B.equals("")) return true;
        Queue<Character> queue = new LinkedList<>();
        for(char c : A.toCharArray()) queue.offer(c);
        for(int i = 0;i < A.length();i++){
            queue.offer(queue.poll());
            StringBuffer sb = new StringBuffer();
            for(char c : queue)
                sb.append(c);
            if(sb.toString().equals(B)){
                return true;
            }
        }
        return false;
    }

}

