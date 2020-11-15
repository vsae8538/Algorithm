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

class Solution {
    public String longestWord(String[] words) {
        if(words.length == 0 || words == null)
            return null;
        Trie trie = new Trie(words);
        trie.buildTireTree(1);
        return trie.dfs();
    }
}


class TrieNode{
    TrieNode[] children;
    int end;
    public TrieNode(){
        children = new TrieNode[26];
    }
}

class Trie{
    TrieNode root;
    String[] words;

    Trie(String[] words){
        root = new TrieNode();
        this.words = words;
    }

    public void buildTireTree(int index){
        for(String s : words){
            TrieNode node = root;
            for(int i = 0;i < s.length();i++){
                char currentChar = s.charAt(i);
                if(node.children[currentChar - 'a'] == null){
                    node.children[currentChar- 'a'] = new TrieNode();
                }
                node = node.children[currentChar - 'a'];
            }
            node.end = index++;
        }
    }

    public String dfs(){
        String res = "";
        Stack<TrieNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TrieNode node = stack.pop();
            if(node.end > 0 || node == root){
                if(node != root){
                    String word = words[node.end - 1];
                    if(word.length() > res.length() || 
                       word.length() == res.length() && word.compareTo(res) < 0){
                        res = word;
                    }        
                }
                for(TrieNode trieNode : node.children){
                    if(trieNode != null){
                        stack.push(trieNode);
                    }
                }
            }
        }

        return res;
    }
}