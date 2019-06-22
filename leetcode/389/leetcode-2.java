import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


class leetcode {
    public static void main(String[] args) {
        char a = 'a';
        System.out.println(a-'a');
    }

    //s合減去t的合就是答案
    public char findTheDifference(String s, String t) {
        int ssum = 0;
        int tsum = 0;
        for(int i = 0;i < s.length();i++)
            ssum += s.charAt(i) - 'a';
        for(int i = 0;i < t.length();i++)
            tsum += s.charAt(i) - 'a';
        return 0;
    }

}