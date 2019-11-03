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
import java.util.Stack;

class leetcode {
    public static void main(String[] args) {
  
    }
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int last = 0,bal = 0;
        char c = S.charAt(0);
        for(int i = 1;i < S.length();i++){
            if(S.charAt(i) == c){
                bal++;
                last = i;
            }else{
                if(bal >= 2){
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(last - bal);
                    list.add(last);
                    res.add(list);
                }
                bal = 0;
                last = 0;
                c = S.charAt(i);
            }
        }
        //將剩餘或未處理的清算
        if(bal >= 2){
            List<Integer> list = new ArrayList<Integer>();
            list.add(last - bal);
            list.add(last);
            res.add(list);
        }
        return res;
    }
}
