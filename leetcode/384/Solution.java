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
     * Fisher-Yates 洗牌
     * 
     */
    private int[] array;
    private int[] original;

    Random rand = new Random();

    private int randRange(int min, int max) {
        return rand.nextInt(max - min) + min;
    }

    private void swapAt(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public Solution(int[] nums) {
        array = nums;
        original = nums.clone();
    }
    
    public int[] reset() {
        array = original;
        original = original.clone();
        return original;
    }
    
    public int[] shuffle() {
        for (int i = 0; i < array.length; i++) {
            swapAt(i, randRange(i, array.length));
        }
        return array;
    }

    /**
     * 回溯 TLE
     */
    // int[] nums;
    // int[] copy;
    // List<List<Integer>> list = new ArrayList<>();
    // public Solution(int[] nums) {
    //     this.nums = nums;
    //     this.copy = nums;
    //     bracktracking(nums, 0, new ArrayList<>());
    // }  
    
    // /** Resets the array to its original configuration and return it. */
    // public int[] reset() {
    //    System.arraycopy(copy, 0, nums, 0, nums.length);
    //    return nums;
    // }
    
    // /** Returns a random shuffling of the array. */
    // public int[] shuffle() {
    //     Random ran = new Random();
    //     List<Integer> tmp = list.get(ran.nextInt(list.size()));
    //     return tmp.stream().mapToInt(i->i).toArray();
    // }

    // public void bracktracking(int[] nums, int index, List<Integer> tmp){
    //     if(tmp.size() == nums.length){
    //         list.add(new ArrayList<>(tmp));
    //         return;
    //     }

    //     for(int i = index;i < nums.length;i++){
    //         if(tmp.contains(nums[i])){
    //             continue;
    //         }
    //         tmp.add(nums[i]);
    //         bracktracking(nums, i, tmp);
    //         tmp.remove(tmp.size()-1);
    //     }

    // }
}   


