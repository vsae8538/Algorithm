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

    public void moveZeroes(int[] nums) {
        int i = 0, j = 0;
        for(;j < nums.length;j++){
            if(nums[j] != 0){
                nums[i] = nums[j];
                i++;
            }
        }
        for(;i < nums.length;i++){
            nums[i] = 0;
        }
    }
}   


