import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

class leetcode {


    public static void main(String[] args) {    

    }
    
    /**
     * DFS + 回溯
     */
    List<String> list = new ArrayList<>();
    public String getHappyString(int n, int k) {
        char[] nums = {'a','b','c'};
        dfs(nums, "", n);
        if(list.size() < k){
            return "";
        }
        else{
            return list.get(k-1);
        }
    }

    public void dfs(char[] nums, String s, int n){
        if(s.length() == n){
            list.add(s);
            return;
        }
        for(int i = 0;i < nums.length;i++){
            if(s.equals("") || s.charAt(s.length()-1) != nums[i]){
                dfs(nums,s+nums[i],n);
            }
        }
        return;
    }
}

