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

class MapSum {

    Trie trie;

    /** Initialize your data structure here. */
    public MapSum() {
        trie = new Trie();
    }
    
    public void insert(String key, int val) {
        trie.buildTrieNode(key, val);
    }
    
    public int sum(String prefix) {
        return trie.searchPrefix(prefix);
    }
}

class TrieNode{
    TrieNode[] children;
    int R;
    int val;
    boolean isEnd;
    public TrieNode(){
        children = new TrieNode[26];
        R = 26;
        val = 0;
        isEnd = false;
    }  
}

class Trie{

    TrieNode root;

    public Trie(){
        root = new TrieNode();
    }

    public void buildTrieNode(String s, int val){
        TrieNode node = root;
        for(char c : s.toCharArray()){
            if(node.children[c - 'a'] == null){
                node.children[c - 'a'] = new TrieNode();
            }
            node = node.children[c - 'a'];
        }
        node.val = val;
        //node.isEnd = true;
    }

    public int searchPrefix(String prefix){
        TrieNode node = root;
        int sum = 0;
        for(int i = 0;i < prefix.length();i++){
            char c = prefix.charAt(i);
            if(node.children[c - 'a'] == null)
                return 0;
            node = node.children[c - 'a'];
        }
        
        sum += node.val;
        for(int i = 0;i < root.R;i++){
            if(node.children[i] != null){
                sum += trackTrie(node.children[i]);
            }
        }

        return sum;
    }

    public int trackTrie(TrieNode node){
        if(node == null)
            return 0;
        int sum = node.val;
        for(int i = 0;i < node.R;i++){
            if(node.children[i] != null){
                sum += trackTrie(node.children[i]);
            }
        }
        return sum;
    }
}