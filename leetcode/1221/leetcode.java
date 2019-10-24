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
    public int balancedStringSplit(String s) {
        int bal = 0, res = 0;
        for(char c : s.toCharArray()){
            if(c == 'R') bal++;
            else bal--;
            if(bal == 0) res++;
        }
        return res;
    }
}

