import java.util.Arrays;

/**
 * RadixSort
 */
public class RadixSort {


    public void sort(int[] nums){
        int n = nums.length;
        
        if(n < 2){
            return;
        }
        
        long exp = 1;
        int[] buf = new int[n];
        int maxVal = Arrays.stream(nums).max().getAsInt();  

        while(maxVal >= exp){
            int[] cnt = new int[10];
            for (int i = 0; i < n; i++) {
                int digit = (nums[i] / (int) exp) % 10;
                cnt[digit]++;
            }
            for (int i = 1; i < 10; i++) {
                cnt[i] += cnt[i - 1]; //確認有幾個比當前位數小,作為確認buf數組的位置用
            }

            for (int i = 0; i < n; i++) {
                int digit = (nums[i] / (int) exp) % 10;
                buf[cnt[digit] - 1] = nums[i];
                cnt[digit]--;
            }
            System.arraycopy(buf, 0, nums, 0, n);
            exp *= 10;
        }


    }

    
}