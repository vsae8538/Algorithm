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


    /**
     * 
     */
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] st = sentence.split(" ");
        int size = searchWord.length();
        for(int i = 0;i < st.length;i++){
            if(st[i].length() >= size && st[i].substring(0,size).equals(searchWord)){
                return i+1;
            }
        }
        return -1;
    }


}
