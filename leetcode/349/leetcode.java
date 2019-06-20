
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class leetcode {
    public static void main(String[] args) {
        System.out.println("test");
    } 
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        for(int i:nums1) set.add(i);
        for(int i:nums2) set2.add(i);
        int idx = 0;
        int[] res;
        if(nums1.length < nums2.length){
            res = new int[set.size()];
            for(Integer i:set2)
                if(set.contains(i))
                    res[idx++] = i;
        }else{
            res = new int[set2.size()];
            for(Integer i:set)
                if(set2.contains(i))
                    res[idx++] = i;
        }
        return Arrays.copyOf(res, idx);
    }
}
