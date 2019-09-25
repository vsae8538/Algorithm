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
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i : nums1)
            if(map.containsKey(i))
                map.put(i, map.get(i)+1);
            else
                map.put(i, 1);
        for(int i : nums2){
            if(map.containsKey(i)){
                if(map.get(i) > 0){
                    list.add(i);
                    map.put(i, map.get(i)-1);
                }
            }
        }
        int[] res = new int[list.size()];
        for(int i = 0;i < list.size();i++)
            res[i] = list.get(i);
        
        return res;
    }
}

