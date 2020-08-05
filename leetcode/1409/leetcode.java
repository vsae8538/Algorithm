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
    public int[] processQueries(int[] queries, int m) {
        int[] res = new int[queries.length];
        int[] arr = new int[m];
        for(int i = 0;i < m;i++)
            arr[i] = i+1;
        
        for(int i = 0;i < queries.length;i++){
            int idx = 0;
            for(int n = 0;n < m;n++){
                if(arr[n] == queries[i]){
                    idx = n;
                    break;
                }
            }
            res[i] = idx;
            for(int j = idx-1;j >= 0;j--){
                arr[j+1] = arr[j];
            }

            arr[0] = queries[i];
        }
        return res;
    }
}

