import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class leetcode {
    public static void main(String[] args) {

    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int[] mapping = new int[nums.length];
        Arrays.fill(mapping, 0);
        for(int i = 0;i < nums.length;i++){
            mapping[nums[i]-1] = nums[i];
        }
            
        for(int i = 0;i < mapping.length;i++){
            if(mapping[i] == 0){
                list.add(i+1);
            }
        }
        return list;
    }
}