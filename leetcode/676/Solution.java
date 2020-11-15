import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;


public class Solution {
    
    TrieNode dict;

    /** Initialize your data structure here. */
    public MagicDictionary() {
        dict = new TrieNode();
    }
    
    public void buildDict(String[] dictionary) {
        for(String word : dictionary){
            TrieNode node = dict;
            for(int i = 0;i < word.length();i++){
                char currentChar = word.charAt(i);
                if(!node.containKey(currentChar)){
                    node.put(currentChar, new TrieNode());
                }
                node = node.get(currentChar);
            }
            node.setEnd();
        }
    }
    
    public boolean search(String searchWord) {
        char[] word = searchWord.toCharArray();
        TrieNode node = dict;
        for(int i = 0;i < searchWord.length();i++){
            char currentChar = searchWord.charAt(i);
            for(int j = 0;j < 26;j++){
                char c = (char)('a' + j);
                if(c == currentChar || !node.containKey(c)) continue;
                if(helper(searchWord, i+1, node.get(c))) return true;
            }
            if(!node.containKey(currentChar)) return false;
            node = node.get(currentChar);
        }
        return false;
    }

    public boolean helper(String s, int index, TrieNode node){
        TrieNode tmpNode = node;
        for(int i = index;i < s.length();i++){
            char c = s.charAt(i);
            if(!tmpNode.containKey(c)) 
                return false;
            tmpNode = tmpNode.get(c);
        }
        return tmpNode.isEnd();
    }

}

class TrieNode{
    
    private TrieNode[] list;
    private int R;
    private boolean isEnd;

    TrieNode(){
        isEnd = false;
        R = 26;
        list = new TrieNode[R];
    }

    public boolean containKey(char c){
        return list[c - 'a'] != null;
    }

    public void put(char c, TrieNode node){
        list[c - 'a'] = node;
    }


    public TrieNode get(char c){
        return list[c - 'a'];
    }


    public void setEnd(){
        isEnd = true;
    }

    public boolean isEnd(){
        return isEnd;
    }
}


