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
    public int[] finalPrices(int[] prices) {
        int[] res = new int[prices.length];
        
        for(int i = 0;i < prices.length;i++){
            if(i + 1 >= prices.length){
                res[i] = prices[i];
                continue;
            }
            int st = 0;
            for(int j = i + 1;j < prices.length;j++){
                if(prices[j] <= prices[i]){
                    res[i] = prices[i] - prices[j];
                    st = 1;
                    break;
                }
            }
            if(st == 0){
                res[i] = prices[i];
            }
        }
        return res;
    }
}

