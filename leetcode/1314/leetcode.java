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
    public int[][] matrixBlockSum(int[][] mat, int K) {
        int[][] res = new int[mat.length][mat[0].length];
        for(int i = 0;i < res.length;i++){
            for(int j = 0;j < res[0].length;j++){
                int rM = i + K >= res.length ? res.length - 1 : i + K;
                int cM = j + K >= res[0].length ? res[0].length - 1 : j + K;
                int sum = 0;
                int ri;
                int ci;
                if(i - K > 0 && i - K < res.length)
                    ri = i - K;
                else
                    ri = 0;
                if(j - K > 0 && j - K < res.length)
                    ci = j - K;
                else
                    ci = 0;
                for(int r = ri;r <= rM;r++){
                    for(int c = ci;c <= cM;c++){
                        sum += mat[r][c];
                    }        
                }
                res[i][j] = sum;
            }
        }
        return res;
    }
}

