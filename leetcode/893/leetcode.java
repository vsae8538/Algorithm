import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

class leetcode {
    public static void main(String[] args) {    
        System.out.print("Hello World\n");
    } 
    public int numSpecialEquivGroups(String[] A) {
        Set<String> set = new HashSet<>();
        for(String s : A){
            int[] odd= new int[26];
            int[] even= new int[26];
            for(int i = 0;i < s.length();i++){
                char c = s.charAt(i);
                if(i % 2 == 0){
                    even[c - 'a']++; //偶
                }else{
                    odd[c - 'a']++; //奇
                }
            }
            String sig = Arrays.toString(odd) + Arrays.toString(even);
            set.add(sig);
        }
        return set.size();
    }
}

