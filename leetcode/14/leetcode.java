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

class leetcode {


    public static void main(String[] args) {    

    }
    public String longestCommonPrefix(String[] strs) {
        if(strs.length < 1)
            return "";
        String shortest = strs[0];
        for(int i = 0;i < strs.length;i++)
            shortest = strs[i].length() < shortest.length() ? strs[i] : shortest;
        for(int i = 0;i < shortest.length();i++){
            for(int j = 0;j < strs.length;j++){
                if(shortest.charAt(i) != strs[j].charAt(i)){
                    return shortest.substring(0, i);
                }
            }
        }
        return shortest;
    }
}

