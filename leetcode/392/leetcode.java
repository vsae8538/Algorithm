import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

class leetcode {
    public static void main(String[] args) {
        
    }
    //擊敗83%
    //但此題應該使用Binary Search來解題較能訓練
    public boolean isSubsequence(String s, String t) {
        if(s.equals("")) return true;
        int pt = 0;
        for(char c : t.toCharArray()){
            if(c == s.charAt(pt)) pt++;
            if(pt == s.length()) return true;
        }
        return false;
    }

}   