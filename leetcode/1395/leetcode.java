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
    //O(n^3) 暴力法 擊破47%
    public int numTeams(int[] rating) {
        int res = 0;
        for(int i = 0;i < rating.length - 2;i++){
            for(int j = i+1;j < rating.length;j++){
                for(int k = j+1;k < rating.length;k++){
                    if(rating[j] > rating[i] && rating[k] > rating[j] && rating[k] > rating[i])
                        res++;
                    else if(rating[j] < rating[i] && rating[k] < rating[j] && rating[k] < rating[i])
                        res++;
                }
            }
        }
        return res;
    }
}

