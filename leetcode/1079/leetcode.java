import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

class leetcode {
    public static void main(String[] args) {
        System.out.println('Z' - 'A');
    }
    int arr[] = new int[26];
    int count =  0;
    public int numTilePossibilities(String tiles) {
        for(char ch :  tiles.toCharArray())
            arr[ch - 65] ++; //大寫字母
        trackback();
        return count;
    }

    public void trackback(){
        for(int i = 0;i < 26;i++){
            if(arr[i] > 0){
                count++;
                arr[i]--;
                trackback();
                arr[i]++; //重置狀態
            }
        }
    }
}