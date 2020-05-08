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
    public int maximum69Number (int num) {
        int max = num;
        String s = new String(String.valueOf(num));
        for(int i = 0;i < s.length();i++){
            StringBuffer sb = new StringBuffer(s);
            if(s.charAt(i) == '9'){
                sb.replace(i+1, i+1, "6");
            }else{
                sb.replace(i+1, i+1, "9");
            }
            System.out.println(sb.toString());
            if(Integer.valueOf(sb.toString()) > max){
                max = Integer.valueOf(sb.toString());
            }
        }
        return max;
    }
}

