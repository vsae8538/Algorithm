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
    public int search(int[] nums, int target) {
        int low = 0;
        int hight = nums.length;
        int mid = (hight + low) / 2;
        if(nums.length == 1 && nums[0] == target) return 0;
        while(low <= hight && mid < nums.length){
            if(target < nums[mid]){
                hight = mid - 1;
            }
            else if(target > nums[mid]){
                low = mid + 1;
            }else{
                return mid;
            }
            mid = (hight + low) / 2;

        }
        return -1;
    }
}

