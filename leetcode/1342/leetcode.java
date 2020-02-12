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

    public int numberOfSteps (int num) {
        int res = 0;
        while(num > 0){
            if(num % 2 == 1) 
                num -= 1;
            else
                num /= 2;
            res++;
        }
        return res;
    }

}   