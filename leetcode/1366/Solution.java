import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
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
import java.util.Map.Entry;

class Solution {

    public String rankTeams(String[] votes) {
        Map<Character,int[]> map = new HashMap<>();
        int len = votes[0].length();
        
        for(String vote : votes){
            for(int i = 0;i < len;i++){
                char c = vote.charAt(i);
                map.putIfAbsent(c, new int[len]);
                map.get(c)[i]++;
            }
        }

        List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a,b) -> { 
            for(int i = 0;i < len;i++){
                //遞減排序,若a比b大返回負數
                // if(map.get(a)[i] > map.get(b)[i]){
                //     return -1; 
                // }else if(map.get(a)[i] < map.get(b)[i]){
                //     return 1;
                // }
                if(map.get(a)[i] != map.get(b)[i])
                    return map.get(b)[i] - map.get(a)[i];
            }    
            return a - b; //若rank均相同,則返回字母順序
        });

        String res = "";
        for(char c : list){
            res = res + c;
        }
        return res;
    }
}
