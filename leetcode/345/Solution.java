import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
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

    public String reverseVowels(String s) {
//        Set<Character> set = new HashSet<>();
        char[] ch = s.toCharArray();
        for(int i = 0,j = s.length()-1;i < j;){
            char ic = s.charAt(i);
            char jc = s.charAt(j);
            if("aeiouAEIOU".indexOf(ic+"") == -1){
                i++;
            }
            if("aeiouAEIOU".indexOf(jc+"") == -1){
                j--;
            }
            if("aeiouAEIOU".indexOf(ic+"") != -1 && "aeiouAEIOU".indexOf(jc+"") != -1){
                ch[i] = jc;
                ch[j] = ic;
                i++;
                j--;
            }
        }
        return new String(ch);
    }

}



