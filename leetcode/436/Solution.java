import java.math.BigDecimal;
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
import java.util.LinkedList;;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;


class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int len = intervals.length;
        if (len == 0) {
            return new int[0];
        }
        Map<Integer, Integer> hashMap = new HashMap<>(len);

        int[] arr = new int[len];
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            hashMap.put(intervals[i][0], i);
            arr[i] = intervals[i][0];
        }

        Arrays.sort(arr);

        for (int i = 0; i < len; i++) {
            int index = binarySearch(arr, intervals[i][1]);
            if (index == -1) {
                res[i] = -1;
            } else {
                res[i] = hashMap.get(arr[index]);
            }
        }
        return res;
    }

    private int binarySearch(int[] arr, int target) {
        int len = arr.length;
        if (arr[len - 1] < target) {
            return -1;
        }

        int left = 0;
        int right = len - 1;
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}



