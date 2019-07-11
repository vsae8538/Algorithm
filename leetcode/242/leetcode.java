import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class leetcode {
    public static void main(String[] args) {
        System.out.println("hello world");

    } 
    public boolean isAnagram(String s, String t) {
        int[] a1 = new int[26];
        int[] a2 = new int[26];
        for(char c : s.toCharArray())
            a1[c - 'a']++;
        for(char c : t.toCharArray())
            a2[c - 'a']++;
        for(int i = 0;i < 26;i++){
            if(a1[i] != a2[i])
                return false;
        }
        return true;
    }
}
