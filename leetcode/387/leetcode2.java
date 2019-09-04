import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

class leetcode {
    public static void main(String[] args) {

    }
    public int firstUniqChar(String s) {
        int[] arr = new int[26];
        for(int i = 0;i < s.length();i++)
            arr[s.charAt(i) - 'a']++;
        for(int i = 0;i < s.length();i++)
            if(arr[s.charAt(i) - 'a'] == 1) 
                return i;
        return -1;
    }
}

