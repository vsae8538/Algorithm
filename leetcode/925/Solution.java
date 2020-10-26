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
import java.util.TreeMap;
import java.util.TreeSet;


class Solution {

    /**
     * 
     */
    public boolean isLongPressedName(String name, String typed) {
        int i = 0, m = name.length(), n = typed.length();
        for (int j = 0; j < n; ++j)
            if (i < m && name.charAt(i) == typed.charAt(j))
                ++i;
            else if (j == 0 || typed.charAt(j) != typed.charAt(j - 1))
                return false;
        return i == m;
    }


    /**
     * "alex"
       "aaleelx"

     */
    public boolean isLongPressedName(String name, String typed) {
        if(typed.charAt(0) != name.charAt(0)) return false;
        int i = 0, j = 0;
        int[] map = new int[26];
        for(char c : name.toCharArray()) map[c-'a']++;
        for(i = 0;i < typed.length();i++){
            if(j == name.length()) break;
            char c = typed.charAt(i);
            if(c == name.charAt(j)){
                j++;
            }else if(map[c-'a'] == 0){
                return false;
            }else if(j > 0 && c != name.charAt(j) && c != name.charAt(j-1)){
                return false;
        }
        for(;i < typed.length();i++){
            char c = typed.charAt(i);
            if(map[c-'a'] == 0)
                return false;
        }
        return j == name.length();
    }
}



