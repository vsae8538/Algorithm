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

    public int getDecimalValue(ListNode head) {
        StringBuffer sb = new StringBuffer();
        
        ListNode pt = head;
        while(pt != null){
            sb.append(pt.val);
            pt = pt.next;
        }
        return binTransfer(sb.reverse().toString());
    }

    public int binTransfer(String s){
        int res = 0;
        int pt = 1;
        for(char c : s.toCharArray()){
            if(c == '1')
                res += pt;
            pt *= 2;
        }
        return res;
    }
}   