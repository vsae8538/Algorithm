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
        int res = 0;
        for(int i = 0;i < prices.length - 1;i++){
            for(int j = i + 1;j < prices.length;j++){
                int diff = Math.abs(prices[i] - prices[j]);
                if(prices[i] > diff && prices[i] > prices[j])
                    continue;
                else
                    res = Math.max(res, diff);
            }
        }
        return res;
    }
}
