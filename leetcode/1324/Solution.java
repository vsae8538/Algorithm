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
     * 
     * 
         AA
     *   BBB
     *   C
     *   DDDD
     *   EEEEE
     *   F
     * 
     *   ABCDEF
     *   
     * @return
     */
    public List<String> printVertically(String s) {
        List<String> res = new ArrayList<>();
        if(s.length() < 1 || s == null) return res;
        String[] sp = s.split(" ");
        int len = 0;
        for(String string : sp) len = Math.max(string.length(), len);

        for(int i = 0;i < len;i++){
            String st = "";
            String space = "";
            for(int j = 0;j < sp.length;j++){
                if(i >= sp[j].length()){
                    space += " ";
                }else{
                    st += space;
                    st += sp[j].charAt(i);
                }
            }
           res.add(st);
        }

        return res;
    }
}



