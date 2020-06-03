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


    public int[] sortByBits(int[] arr) {

        Arrays.sort(arr, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {

            }
        }

        for(int i = 0;i < arr.length - 1;i++){
            for(int j = i + 1;j < arr.length;j++){
                int t1 = Integer.bitCount(arr[i]);
                int t2 = Integer.bitCount(arr[j]);
                if(t1 == t2){
                    if(arr[i] > arr[j]){
                        int tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                    }    
                }else if(t1 > t2){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }



}

