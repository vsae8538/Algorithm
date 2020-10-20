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
import java.util.TreeMap;
import java.util.TreeSet;


class Solution {
    /**
     * 雙指針
     * 
     * 
     */
    public int removeDuplicates(int[] nums) {
        int j = 1, count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count <= 2) {
                nums[j++] = nums[i]; //j=下一個要覆蓋的元素
            }
        }
        return j;
    }


    // public int[] remElement(int[] arr, int index) {
    //     for (int i = index + 1; i < arr.length; i++) {
    //         arr[i - 1] = arr[i];
    //     }
    //     return arr;
    // }    
    
    // public int removeDuplicates(int[] nums) {
    //     int i = 1, count = 1, length = nums.length;
    //     while (i < length) {
    //         if (nums[i] == nums[i - 1]) {
    //             count++;
    //             if (count > 2) {
    //                 this.remElement(nums, i); 
    //                 i--;
    //                 length--;//刪除一個元素後的長度
    //             }
    //         } else {
    //             count = 1;
    //         }
    //         i++;
    //     }   
    //     return length;
    // }

}



