import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

class leetcode {

    /*
    [4]
    [2,4]
    [2,4,4]
    [2,4,4,3]
    [2,2,4,4,3]
    */
    public static void main(String[] args) {    

    }
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] res = new int[nums.length];
        for(int i = 0;i < index.length;i++){
            int j; 
            for(j = nums.length - 1;j > index[i];j--){
                res[j] = res[j-1];
            }           
            res[j] = nums[i];
        }
        return res;
    }
}

