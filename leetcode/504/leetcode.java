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
import java.util.Set;
import java.util.Stack;

class leetcode {
    public static void main(String[] args) {
  
    }
    public String convertToBase7(int num) {
        StringBuffer sb = new StringBuffer();
        String res = "";
        if(num < 0){
            num = -num;
            res += "-";
        }
        do{
            int mod = num % 7;
            sb.append(mod);
            num /= 7;
        }while(num > 0);
        res += sb.reverse().toString();
        return res;
    }
}   
