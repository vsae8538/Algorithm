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
import java.util.Set;
import java.util.Stack;

class leetcode {
    public static void main(String[] args) {
        
    }

    public int subtractProductAndSum(int n) {
        int pod = 1, sod = 0;
        while(n > 0){
            int num = n % 10;
            pod *= num;
            sod += num;
            n /= 10;
        }
        return pod - sod;
    }
}   