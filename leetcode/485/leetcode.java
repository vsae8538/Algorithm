
class leetcode {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    } 

    public static int findMaxConsecutiveOnes(int[] nums) {
        int cur = 0,max = 0;
        for(int i : nums){
            if(i == 1){
                ++cur;
                max = Math.max(max,cur);
            }
            else
                cur = 0;
        }
        return max;
    }
}
