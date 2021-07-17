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
import java.util.stream.IntStream;
import java.util.Random;

class Solution{

    /**
     * 雙指針
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int length1 = nums1.length, length2 = nums2.length;
        int[] intersection = new int[Math.min(length1, length2)];
        int index1 = 0, index2 = 0, index = 0;
        while (index1 < length1 && index2 < length2) {
            if (nums1[index1] < nums2[index2]) {
                index1++;
            } else if (nums1[index1] > nums2[index2]) {
                index2++;
            } else {
                intersection[index] = nums1[index1];
                index1++;
                index2++;
                index++;
            }
        }
        return Arrays.copyOfRange(intersection, 0, index);
    }


    /**
     * Hash
     */
    public int[] intersect(int[] nums1, int[] nums2) {     
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums1.length;i++){
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for(int i = 0;i < nums2.length;i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0){
                list.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i])-1);
            }
        }

        return list.stream().mapToInt(i->i).toArray();
    }

}   


