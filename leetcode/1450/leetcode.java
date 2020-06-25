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
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int res = 0;
        for(int i = 0;i < startTime.length;i++){
            if((endTime[i] >= queryTime && startTime[i] <= queryTime) || endTime[i] == queryTime || startTime[i] == queryTime) res++;
        }
        return res;
    }
}

