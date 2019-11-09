import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

class leetcode {
    public static void main(String[] args) {    
        System.out.print("Hello World\n");
    }
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int diff = 0;
        for(int i = 0;i < arr.length - 1;i++){
            if(i == 0){
                List<Integer> list = new ArrayList<Integer>();
                list.add(arr[i]);
                list.add(arr[i+1]);
                diff = Math.abs(arr[i] - arr[i+1]);
                res.add(list);
            }else{
                int num = Math.abs(arr[i] - arr[i+1]);
                if(num == diff){
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(arr[i]);
                    list.add(arr[i+1]);
                    res.add(list);
                }else if(num < diff){ //如果中途數組兩值的差，小於最低兩索引的差 [40,11,26,27,-20] -> [[26,27]]
                    res.clear();
                    diff = num;
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(arr[i]);
                    list.add(arr[i+1]);
                    res.add(list);
                }
            }
        }
        return res;
    }
}

