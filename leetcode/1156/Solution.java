import java.lang.reflect.Array;
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


    /**
     * "acbaaa"

     */
    public int maxRepOpt1(String text) {
        int len = text.length();
        int[] ch_count = new int[26];
        for (int i = 0; i < len; ++i)
            ++ch_count[text.charAt(i) - 'a'];

        char last_ch = text.charAt(0);
        int count = 1, res = 1;
        for (int i = 1; i < len; ++i) {
            if (last_ch != text.charAt(i)) {
                int temp_idx = i;
                while (temp_idx + 1 < len && last_ch == text.charAt(temp_idx + 1)) {
                    ++count;
                    ++temp_idx;
                }
                if (ch_count[last_ch - 'a'] > count)
                    ++count;
                res = Math.max(res, count);
                count = 1;
                last_ch = text.charAt(i);
            } else
                ++count;
        }
        if (count > 1 && ch_count[last_ch - 'a'] > count)
             ++count;
        return Math.max(res, count);
    }

}



