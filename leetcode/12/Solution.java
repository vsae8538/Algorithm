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
    public String intToRoman(int num) {
        Map<Integer,String> map = new HashMap<>(){{
            put(1, "I");put(2,"II");put(3,"III");put(5, "V");
            put(6,"VI");put(7,"VII");put(8,"VIII"); 
            put(10, "X");put(20,"XX");put(30,"XXX");
            put(50, "L");put(60,"LX");put(70,"LXX");put(80,"LXXX");
            put(100, "C");put(200, "CC");put(300, "CCC");put(500, "D");
            put(600, "DC");put(700, "DCC");put(800, "DCCC");
            put(1000, "M");put(2000, "MM");put(3000, "MMM");
            put(4, "IV");put(9, "IX");put(40, "XL");
            put(90, "XC");put(400, "CD");put(900,"CM");
            put(0, "");
        }};
        int n = 1;
        StringBuffer sb = new StringBuffer();
        sb.append(String.valueOf(num));
        String res = "";
        for(int i = sb.length()-1;i >= 0;i--){
            int a = sb.charAt(i) - '0';
            a *= n;
            res = map.get(a) + res;
            n *= 10;
        }
        return res;
    }
}



