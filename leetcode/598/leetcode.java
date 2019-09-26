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
    /**
     * 取最小值的積
     */
    public int maxCount(int m, int n, int[][] ops) {
        if(ops.length == 0)
            return m*n;
        int maxM = ops[0][0];
        int maxN = ops[0][1];
        for(int i = 0;i < ops.length;i++){
            if(maxM > ops[i][0]) maxM = ops[i][0];
            if(maxN > ops[i][1]) maxN = ops[i][1];
        }
        return maxM*maxN;
    }
}

