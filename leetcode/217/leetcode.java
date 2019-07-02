import java.util.HashSet;
import java.util.Set;

class leetcode {
    public static void main(String[] args) {
        System.out.println("hello world");
    } 

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i : nums){
            if(set.contains(i))
                return true;
            else
                set.add(i);
        }
        return false;
    }
}
