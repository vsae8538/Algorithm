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

    public String[] findRelativeRanks(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i = 0;i < nums.length;i++) arr[i] = nums[i];
        Arrays.sort(nums);
        Map<Integer,String> rankMap = new HashMap<>();
        String[] res = new String[nums.length];
        int cnt = 0;
        for(int i = nums.length - 1;i >= 0;i--){
            if(cnt == 0)
                rankMap.put(nums[i], "Gold Medal");
            else if(cnt == 1)
                rankMap.put(nums[i], "Silver Medal");
            else if(cnt == 2)
                rankMap.put(nums[i], "Bronze Medal");
            else
                rankMap.put(nums[i], String.valueOf(cnt+1));
            cnt++;
        }
        for(int i = 0;i < nums.length;i++)
           res[i] = rankMap.get(arr[i]);

        return res;
    }
}

