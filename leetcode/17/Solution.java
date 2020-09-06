import java.lang.reflect.Array;
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

    /**
     * O(n^3) 居然通過
     */
    Map<Character,String> map = new HashMap<>();
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        buildMap();
        for(char c : digits.toCharArray()){
            String s = map.get(c);
            if(list.size() == 0){
                for(char ch : s.toCharArray()) list.add(new String(""+ch));
            }else{
                int len = list.size();
                for(int i = 0;i < len;i++){
                    String str = list.get(i);
                    for(int j = 0;j < s.length();j++){
                        char ch = s.charAt(j);
                        list.add(str+ch);
                    }
                }
            }
        }
        List<String> res = new ArrayList<>();
        for(String s : list){
            if(s.length() == digits.length()) res.add(s);
        }
        return res;
    }

    public void buildMap(){
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
    }

}



