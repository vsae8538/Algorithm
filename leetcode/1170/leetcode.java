import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

class leetcode {
    public static void main(String[] args) {
        System.out.println('Z' - 'A');
    }
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] res = new int[queries.length];
        //取得queries最小字母的數量
        for(int i = 0;i < queries.length;i++)
            res[i] = getMinLetterCount(queries[i]); 
        //開始比較queries和word,找到每個answer,使得f(queries[i]) < word(w), w為word中的最小字母數量
        for(int i = 0;i < queries.length;i++){
            int letterCnt = res[i], count = 0;
            for(int j = 0;j < words.length;j++){
                int tcnt =  getMinLetterCount(words[j]);
                if(letterCnt < tcnt)
                    count++;
            }
            res[i] = count;
        }  
        return res;
    }
    public int getMinLetterCount(String s){
        int[] letters = new int[26];
        for(char c : s.toCharArray()) 
            letters[c - 'a']++;
        for(int i = 0;i < 26;i++){
            if(letters[i] != 0)
                return letters[i];
        }
        return 0;
    }
}
