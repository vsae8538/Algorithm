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
    public int maxProfit(int[] prices) {
        int max = 0;
        for(int i = 1;i < prices.length;i++){
            if(prices[i] > prices[i - 1])
                max += prices[i] - prices[i - 1];
        }
        return max;
  }
}
