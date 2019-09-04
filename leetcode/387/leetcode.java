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
    public int firstUniqChar(String s) {
        if(s.length() < 1 || s == null) return -1; 
        int[][] arr = new int[26][2];
        for(int i = 0;i < s.length();i++){
            arr[s.charAt(i) - 'a'][0]++;
            arr[s.charAt(i) - 'a'][1] = i;
        }
        int idx = 0,min = Integer.MAX_VALUE;
        for(int i = 0;i < 26;i++){
            if(arr[i][0] == 1){
                min = Math.min(arr[i][1], min);
            }
        }
        if(min == Integer.MAX_VALUE) return - 1;
        else return min;
    }
}

