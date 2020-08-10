import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

class leetcode {


    public static void main(String[] args) {    

    }
    class NumArray {

        public int[] arr;

        public NumArray(int[] nums) {
            arr = nums;
        }
        
        public int sumRange(int i, int j) {
            int res = 0;
            for(int k = i;k <= j;k++){
                res += arr[k];
            }
            return res;
        }
    }
}

