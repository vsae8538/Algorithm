import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

class leetcode {
    public static void main(String[] args) {
  
    }
    /***
     * 將每個陣列中的每個數模60,取得餘數(注意數字剛好是0,則需要再模一次 60 - 0 = 60),並記錄下來
     * 遍歷陣列,如果取得的數模60後存在,則將結果加一, 
     * Input: [30,20,150,100,40]
     * 60 - 30 % 60 = 30 -> index[30]++
     * 60 - 20 % 60 = 40 -> index[20]++
     * 60 - 150 % 60 = 30 -> index[30]已經有值所以加一,index[30]++
     * 60 - 100 % 60 = 20 -> index[20]已經有值所以加一,index[100 % 60]++
     * 60 - 40 % 60 = 20 -> index[20]已經有值所以加一,index[40 % 60]++
     * 因為每個時間段都有60秒減去n,將此餘數存下來,並遍歷陣列每個值,看是否存在餘數+每個陣列值 = 60的倍數的值,則表示結果
     */

    public int numPairsDivisibleBy60(int[] time) {
        int res = 0;
        int[] index = new int[60];
        for(int n : time){
            int r = (60 - n % 60) % 60; //娶得餘數, 最後一個 % 60 表示n剛好是60
            res += index[r];
            index[n % 60]++;
        }
        return res;
    }

    //Time Limit Exceeded
    /*public int numPairsDivisibleBy60(int[] time) {
        int res = 0;
        for(int i = 0;i < time.length - 1;i++){
            for(int j = i + 1;j < time.length;j++){
                if((time[i] + time[j]) % 60 == 0)
                    res++;
            }
        }
        return res;
    }
    */
}
