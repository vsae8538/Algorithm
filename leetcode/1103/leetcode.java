import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

class leetcode {
    public static void main(String[] args) {
        System.out.println('Z' - 'A');
    }
    public int[] distributeCandies(int candies, int num_people) {
        int p = 1,n = 0;
        int res[] = new int[num_people];
        while(candies > 0){
            res[n++] += p;
            candies -= p;
            if(n == num_people) n = 0;
            if(candies < p){
                p = candies < 0 ? 0 : candies;
                continue;
            }else{
                p++;
            }
        }
        return res;    
    }
}
