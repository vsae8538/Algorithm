import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

class Solution {

    public String thousandSeparator(int n) {
        String s = String.valueOf(n);
        if(s.length() < 4) return s;    
        StringBuffer res = new StringBuffer();
        int idx = 0;
        for(int i = s.length()-1;i >= 0;i--){
            if(idx != 0 && idx % 3 == 0) res.insert(0, '.');
            res.insert(0,s.charAt(i));
            idx++;
        }
        return res.toString();
    }

}



