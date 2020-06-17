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
    public static void main(String[] args) {    
        
    }
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length];
        int pt1 = 0,pt2 = 1;
        int cnt = 0;
        res[0] = nums[0];
        while(cnt < n){
            res[pt1] = nums[cnt];
            res[pt2] = nums[n + cnt];
            pt1 +=2;
            pt2 += 2;
            cnt++;
        }

        return res;
    }
}

