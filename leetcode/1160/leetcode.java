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
    public int countCharacters(String[] words, String chars) {
        int res = 0;
        int[] chs = new int[26];
        for(char c : chars.toCharArray())
            chs[c - 'a']++;
        for(String word : words){
            int[] tmp = new int[26];
            int isDiff = 0;
            for(char c : word.toCharArray())
                tmp[c - 'a']++;
            for(int i = 0;i < 26;i++){
                if(tmp[i] > chs[i]){
                    isDiff = 1;
                    break;
                }
            }
            if(isDiff == 0)
                res += word.length();
        }
        return res;
    }
}