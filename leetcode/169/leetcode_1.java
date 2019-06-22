import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


class leetcode {
    public static void main(String[] args) {

    }
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i :nums){
            if(map.containsKey(i))
                map.put(i, map.get(i)+1);
            else
                map.put(i, 1);
        }
        System.out.println(map);
        int max = 0,j = 0;
        for(Integer i : map.keySet()){
            if(j < map.get(i)){
                max = i;
                j = map.get(i);
            }
        }
        return max;
    }
}