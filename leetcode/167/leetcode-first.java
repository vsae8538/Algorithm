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
        for(int i = 0;i < numbers.length - 1;i++){
            for(int j = i + 1;j < numbers.length;j++){
                if(numbers[i] + numbers[j] == target){
                    res[0] = i + 1;
                    res[1] = j + 1;
                    break;
                }
            }
        }   
        return res;
    }
}

