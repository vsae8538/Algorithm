import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

class leetcode {
    public static void main(String[] args) {
  
    }
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] count = new int[100];
        int ans = 0, index = 0;
        for (int[] dom : dominoes) {
            index = dom[0] < dom[1] ? dom[0] * 10 + dom[1] : dom[1] * 10 + dom[0];//1,2 化簡成 21 將最大值放左邊後*10
            ans += count[index]++;
        }
        return ans;
    }
}
