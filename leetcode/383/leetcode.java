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
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        int[] magarr = new int[26];
        for(char c : ransomNote.toCharArray()) arr[c - 'a']++;
        for(char c : magazine.toCharArray()) magarr[c - 'a']++;
        for(int i = 0;i < 26;i++)
            if(arr[i] > magarr[i]) return false;
        return true;   
    }
}

