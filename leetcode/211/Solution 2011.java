import java.math.BigDecimal;
import java.math.BigInteger;
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

class Solution{
     
    TrieNode root;

    /** Initialize your data structure here. */
    public WordDictionary() {
        root = new TrieNode();    
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        TrieNode node = root;
        for(int i = 0;i < word.length();i++){
            char c = word.charAt(i);
            if(node.children[c - 'a'] == null){
                node.children[c - 'a'] = new TrieNode();
            }
            node = node.children[c - 'a'];
        }
        node.end = true;
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        return dfs(word, root, 0); 
    }

    public boolean dfs(String word, TrieNode node, int index){
        if(index == word.length()){
            return node.end;
        }

        char ch = word.charAt(index);
        if(ch == '.'){
            for(int i = 0;i < 26;i++){
                if(node.children[i] != null && dfs(word, node.children[i], index + 1)){
                    return true;
                }
            }
            return false;
        }
        else if(node.children[ch - 'a'] == null){
            return false;
        }

        return dfs(word, node.children[ch - 'a'], index + 1);
    }
}

class TrieNode{
    TrieNode[] children;
    boolean end;
    public TrieNode(){
        children = new TrieNode[26];
        end = false;
    }
}
