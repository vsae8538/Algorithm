import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
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
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;

class Solution{
    public List<String> restoreIpAddresses(String s) {
        int len = s.length();
        List<String> res = new ArrayList<>();

        if (len < 4 || len > 12) {
            return res;
        }

        Deque<String> path = new ArrayDeque<>(4);
        int splitTimes = 0;

        dfs(s, len, splitTimes, 0, path, res);

        return res;
    }

    private int judgeIfIpSegment(String s, int left, int right) {
        int len = right - left + 1;

        if (len > 1 && s.charAt(left) == '0') {
            return -1;
        }

        int res = 0;
        for (int i = left; i <= right; i++) {
            res = res * 10 + s.charAt(i) - '0';
        }

        if (res > 255) {
            return -1;
        }
        return res;
    }

    private void dfs(String s, int len, int split, int begin, Deque<String> path, List<String> res) {
        if (begin == len) {
            if (split == 4) {
                res.add(String.join(".", path));
            }
            return;
        }

        // 1.剩下的不夠分割(4 - split),就剪枝, len - beging 表示剩餘的還未分割的字符串位數 
        if (len - begin < (4 - split) || len - begin > 3 * (4 - split)) {
            return;
        }

        for (int i = 0; i < 3; i++) {
            if (begin + i >= len) {
                break;
            }

            int ipSegment = judgeIfIpSegment(s, begin, begin + i);
            if (ipSegment != -1) {
                path.addLast(ipSegment + "");
                dfs(s, len, split + 1, begin + i + 1, path, res);
                path.removeLast();
            }
        }
    }


}

