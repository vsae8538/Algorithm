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
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int d = arr[1] - arr[0];
        if(arr.length == 2) return true;
        for(int i = 1;i < arr.length - 1;i++){
            if(arr[i+1] - arr[i] != d) return false;
        }
        return true;
    }

}

