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
     * 雙指針
     * 
     */

    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int ans = 0;
        while (l < r) {
            int area = Math.min(height[l], height[r]) * (r - l);
            ans = Math.max(ans, area);
            if (height[l] <= height[r]) {
                ++l;
            }
            else {
                --r;
            }
        }
        return ans;
    }

    /**
     * 暴力 O(n^2)
     */
    // public int maxArea(int[] height) {
    //     int sum = 0;
    //     for(int i = 0;i < height.length-1;i++){
    //         for(int j = i+1;j < height.length;j++){
    //             int h = 0;
    //             if(height[j] <= height[i]){
    //                 h = (j - i) * height[j];
    //             }else{
    //                 h = (j - i) * height[i];
    //             }
    //             sum = Math.max(sum, h);
    //         }
    //     }
    //     return sum;
    // }

}



