import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

class leetcode {
    public static void main(String[] args) {
        System.out.println('Z' - 'A');
    }
    /* HashSet */
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>(); 
        int res = n;
        while(res != 1){
            int num = 0;
            while(res > 0){
                int p = res % 10;
                num += Math.pow(p,2);
                res /= 10;
            }
            if(set.contains(num)) 
                return false;
            else
                set.add(num);
            res = num;
        }
        return true;
    }
}
