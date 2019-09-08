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
        int res[] = new int[queries.length];
        for(int i = 0;i < queries.length;i++){
            int queriesCnt = getMinLetterCount(queries[i]);
            for(int j = 0;j < queries.length;j++){
                int wordCnt = getMinLetterCount(words[j]);
                if(queriesCnt < wordCnt)
                    res[i]++;
            }
        }
        return res;
    }
    public int getMinLetterCount(String s){
        char min = s.charAt(0);
        int count = 1;
        for(int i = 1;i < s.length();i++){
            if(min > s.charAt(i)){
                min = s.charAt(i);
                count = 0;
            }
            if(min == s.charAt(i))
                count++;
        }
        return count;
    }
}
