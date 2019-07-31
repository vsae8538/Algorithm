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
    /**
     * 这个题的意思是, 把一个数组里面的每个数组都加上一个 -K ~ K 之间 的数字
        ,使这个数组的最大值和最小值之间的差值最小,并返回这个最小的差值
     */
    public int smallestRangeI(int[] A, int K) {
        if(A == null) return 0;
        if(A.length == 1) return 0;
        Arrays.sort(A);
        if(A[A.length - 1] - K > A[0] + K) 
            return A[A.length - 1] - A[0] - 2 * K;
        return 0;
    }
}

