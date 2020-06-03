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
        for(int i = 0;i < arr.length - 1;i++){
            for(int j = i + 1;j < arr.length;j++){
                int t1 = get1Count(arr[i]);
                int t2 = get1Count(arr[j]);
                if(t1 == t2){
                        
                }else if(t1 > t2){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }

    public int get1Count(int num){
        String bin = Integer.toBinaryString(num);
        int count = 0;
        for(int i = 0;i < bin.length();i++){
            if(bin.charAt(i) == '1')
                count++;
        }
        return count;
    }

}

