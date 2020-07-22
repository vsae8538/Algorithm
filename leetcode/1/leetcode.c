/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numsSize, int target) {
    int sum;
    int *return_ar = (int *)malloc(2 * sizeof(int));
    for(int i = 0;i < numsSize;i++) {
        for(int j = i + 1;j < numsSize;j++) {
            sum = nums[i] + nums[j];
            if(sum == target){ 
                    return_ar[0] = i;
                    return_ar[1] = j;
                    break;
            }
        }
    }
    return return_ar;
}