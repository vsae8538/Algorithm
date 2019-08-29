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
        int[] arr = new int[3];
        for(int n : arr)
        System.out.println(n);
    }
    public boolean lemonadeChange(int[] bills) {
        int[] arr = new int[2]; // 0 -> 5 , 1 -> 10, 2 -> 20
        for(int bill : bills){
            if(bill == 5){
                arr[0]++;
            }else if(bill == 10){
                if(arr[0] == 0){
                    return false;
                }
                arr[0]--;
                arr[1]++;
            }else{
                if(arr[0] >= 1 && arr[1] >= 1){ // 10 + 5
                    arr[0]--;
                    arr[1]--;
                }else if(arr[0] >= 3){ // 5 + 5 + 5
                    arr[0] -= 3;
                }else{
                    return false;
                }
            }
        }
        return true;   
    }
}

