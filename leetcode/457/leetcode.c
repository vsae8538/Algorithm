
int getnext(int* nums,int i,int numsSize) {
    return (((nums[i] + i) % numsSize) + numsSize) % numsSize;
}

bool circularArrayLoop(int* nums, int numsSize){
    for(int i = 0;i < numsSize;i++) {
        if(nums[i] == 0) {
            continue;
        }
        int slow = i;
        int fast = getnext(nums,i,numsSize);
        int val = nums[i];
        while(val * nums[fast] > 0 && val * nums[getnext(nums,fast,numsSize)] > 0) {
            if(slow == fast) {
                if(slow == getnext(nums,slow,numsSize)) {
                    break;
                }
                return true;
            }
            slow = getnext(nums,slow,numsSize);
            fast = getnext(nums,getnext(nums,fast,numsSize),numsSize);
        }
        slow = i;
        while(val * nums[slow] > 0) {
            int next = getnext(nums,slow,numsSize);
            nums[slow] = 0;
            slow = next;
        }
    }
    return false;
}