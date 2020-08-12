import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

class leetcode {


    public static void main(String[] args) {    

    }
    /*
        
    */
    public boolean stoneGame(int[] piles) {
        int[] dp = new int[2];
        int i = 0;
        int j = piles.length-1;
        int p = 0;
        while(i < j){
            if(piles[i] > piles[j]){
                dp[p] += piles[i];
                i++;
            }else{
                dp[p] += piles[j];
                j--;
            }
            p = p % 2 == 0 ? 0 : 1;
        }
        if(dp[0] > dp[1]){
            return true;
        }else{
            return false;
        }
    }
}

