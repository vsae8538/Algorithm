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

    /**

     */

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);
        if(wordSet.size() == 0 || !wordSet.contains(endWord)){
            return 0;
        }
        wordSet.remove(beginWord);

        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        Set<String> visited = new HashSet<>();
        visited.add(beginWord);

        int step = 1;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0;i < size;i++){
                String s = queue.poll();
                if(changeOneLetter(s, endWord, queue, visited, wordSet)){
                    return step + 1;
                }
                
            }
            step++;
        }
        
        return 0;
    }


    public boolean changeOneLetter(String beginWord, String endWord,
                                    Queue<String> queue, Set<String> visited, Set<String> wordSet){
        char[] beginCharArray = beginWord.toCharArray();
        for(int i = 0;i < endWord.length();i++){
            char originChar = beginCharArray[i];
            for(char c = 'a';c <= 'z';c++){
                if(c == originChar)
                    continue;
                beginCharArray[i] = c;
                String nextWord = new String(beginCharArray);
                if(wordSet.contains(nextWord)){
                    if(nextWord.equals(endWord)){
                        return true;
                    }
                    if(!visited.contains(nextWord)){
                        queue.offer(nextWord);
                        visited.add(nextWord);
                    }
                }
            }
            beginCharArray[i] = originChar;
        }

        return false;
    }
}