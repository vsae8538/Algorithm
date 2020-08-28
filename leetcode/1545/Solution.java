import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
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
import java.util.TreeSet;

class Solution {


    /**
     * 遞歸建立序列
     * @param n
     * @param k
     * @return
     */
    public char findKthBit(int n, int k) {
        return buildKthBitStr(n).charAt(k-1);
    }
 
    public String buildKthBitStr(int n){
        if(n == 1) return "0";
        String res = "";
        String subStr = buildKthBitStr(n-1);
        res = subStr + "1" + reverseAndInvert(subStr);
        return res;
    }

    public String reverseAndInvert(String s){
        StringBuffer sb = new StringBuffer();
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == '0') sb.append('1');
            else sb.append('0');
        }
        return sb.reverse().toString();
    }
    
}



