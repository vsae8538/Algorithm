import java.lang.reflect.Array;
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

class leetcode {


    public static void main(String[] args) {    

    }
    public int minFlips(String target) {
        String s = "0"+target;
        int res = 0;
        for(int i = 1;i < s.length();i++){
            if(s.charAt(i) != s.charAt(i-1)) res++;         
        }
        return res;
    }  

}

