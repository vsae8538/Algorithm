
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class leetcode {
    public static void main(String[] args) {
        System.out.println("test");
    } 
     //O(n^2)
    public int[] intersection(int[] nums1, int[] nums2) {
    List<Integer> list = new ArrayList<Integer>();
       for(int i = 0;i < nums1.length;i++){
           for(int j = 0;j < nums2.length;j++){
                if(nums1[i] == nums2[j])
                    if(!list.contains(nums1[i]))
                        list.add(nums1[i]);
           }
       }
       int[] res = new int[list.size()];
       int index = 0;
       for(Integer i : list) res[index++] = i;
       return res;
    }
}
