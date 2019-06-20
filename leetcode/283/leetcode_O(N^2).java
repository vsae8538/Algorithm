
class leetcode {
    public static void main(String[] args) {
    
    } 
    public void moveZeroes(int[] nums) {
        for(int i = 0;i < nums.length;i++){
            if(nums[i] != 0){
                for(int j = i;j > 0;j--){
                    if(nums[j - 1] == 0){
                        int tmp = nums[j];
                        nums[j] = nums[j - 1];
                        nums[j - 1] = tmp;
                    }
                }
            }
       }
    }
}
