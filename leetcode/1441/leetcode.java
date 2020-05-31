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
    public List<String> buildArray(int[] target, int n) {
        
        List<String> result = new ArrayList<>();
        int cnt = 1;
        for(int i = 0;i < target.length;){
            if(cnt++ == target[i]){
                result.add("Push");
                i++;   
            }else{
                result.add("Push");
                result.add("Pop");
            }
        }
        return result;
    }

}

