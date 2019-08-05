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
    public int[] countBits(int num) {
        int[] res = new int[num + 1];
        res[0] = 0;
        for(int i = 1;i <= num;i++){
            if(i % 2 == 1) 
                res[i] = res[i-1] + 1;
            else
                res[i] = res[i/2]; 
        }
        return res;
    }
}

