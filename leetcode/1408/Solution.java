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

    public List<String> stringMatching(String[] words) {
        List<String> res = new ArrayList<>();
        if(words.length < 2){
            return res;
        }
        
        for(int i = 0;i < words.length;i++){
            for(int j = 0;j < words.length;j++){
                if(i == j || words[i].length() > words[j].length()) continue;
                if(words[j].contains(words[i])){
                    res.add(words[i]);
                    break;
                }
            }
        }
        return res;
    }

}



