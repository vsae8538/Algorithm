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

    public int maxNumberOfBalloons(String text) {
        
        Map<Character,Integer> map = new HashMap<>();
        map.put('b', 0);
        map.put('a', 0);
        map.put('l', 0);
        map.put('o', 0);
        map.put('n', 0);
        int res = 0;
        for(char c : text.toCharArray()){
            if(c == 'b') map.put(c, map.get(c)+1);
            else if(c == 'a') map.put(c, map.get(c)+1);
            else if(c == 'l') map.put(c, map.get(c)+1);
            else if(c == 'o') map.put(c, map.get(c)+1);
            else if(c == 'n') map.put(c, map.get(c)+1);
            if(map.get('b') > 0 && map.get('a') > 0 && map.get('n') > 0){
                if(map.get('l') > 1 && map.get('o') > 1){
                    res++;
                    map.put('b', map.get('b')-1);
                    map.put('a', map.get('a')-1);
                    map.put('l', map.get('l')-2);
                    map.put('o', map.get('o')-2);
                    map.put('n', map.get('n')-1);
                }
            }                
        }

        return res;
    }
}



