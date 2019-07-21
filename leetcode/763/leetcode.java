import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

class leetcode {
    public static void main(String[] args) {
        System.out.println('Z' - 'A');
    }
    public List<Integer> partitionLabels(String S) {
        int[] last = new int[26];
        for(int i = 0; i < S.length();i++){
            last[S.charAt(i) - 'a'] = i;
        }
        List<Integer> list = new ArrayList<Integer>();
        int prevIndex = - 1,maxIndex = 0;
        for(int i = 0; i < S.length();i++){
            int index = last[S.charAt(i) - 'a'];
            if(index > maxIndex){
                maxIndex = index;
            } 
            if(i == maxIndex){
                list.add(maxIndex - prevIndex);
                prevIndex = maxIndex;
            }
        }
        return list;
    }
}