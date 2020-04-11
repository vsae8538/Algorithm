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
    public int[] replaceElements(int[] arr) {
        int[] res = new int[arr.length];
        
        for(int i = 0;i < arr.length - 1;i++){
            int max = arr[i+1];
            if(i+2 == arr.length){
                res[i] = arr[arr.length - 2];
                break;
            }
            for(int j = i+2;j < arr.length;j++)
                if(max < arr[j])
                    max = arr[j];        
            res[i] = max;
        }
        res[arr.length - 1] = -1;
        return res;
    }
}

