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
    public int findContentChildren(int[] g, int[] s) {
        int l = 0, r = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(l < g.length && r < s.length){
            if(g[l] <= s[r++]) l++;
        }
        return res;
    }
}

