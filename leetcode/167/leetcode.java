import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class leetcode {
    public static void main(String[] args) {
        System.out.println("test");
    }
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int low = 0, high = numbers.length - 1;
        while(low < high){
            int sum = numbers[low] + numbers[high];
            if(sum == target){
                res[0] = low + 1;
                res[1] = high + 1;
                break;
            }
            else if(sum < target){
                low++;    
            }
            else if(sum > target){
                high--;
            }
        }
        
        return res;
    }
}

