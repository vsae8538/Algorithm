import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
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
import java.util.TreeSet;

class Solution {

    private int max = 0; 

    public int maxLength(List<String> arr) {

        dfs(arr, 0, "");

        return max;
    }

    public void dfs(List<String> arr, int idx, String track) {
        if (idx == arr.size()) {
            return;
        }
        for (int i = idx; i < arr.size(); i++) {
            if (!checkDup(track, arr.get(i))) {
                max = Math.max(max, track.length() + arr.get(i).length());
                dfs(arr, i + 1, track + arr.get(i));
            }
        }
    }

    boolean checkDup(String str1, String str2) {
        Set<Character> charSet = new HashSet<>();
        for (char ch : str1.toCharArray()) {
            if (charSet.contains(ch)) {
                return true;
            }
            charSet.add(ch);
        }

        for (char ch : str2.toCharArray()) {
            if (charSet.contains(ch)) {
                return true;
            }

            charSet.add(ch);
        }

        return false;
    }

}



