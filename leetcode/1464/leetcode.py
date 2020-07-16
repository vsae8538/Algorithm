class Solution:
    def maxProduct(self, nums: List[int]) -> int:

        # nums.sort()
        # return (nums[-1]-1) * (nums[-2]-1) 

        max = 0
        max2 = 0
        for i in range(0, len(nums)):
            if max <= nums[i]:
                max2 = max 
                max = nums[i]
            elif nums[i] > max2:
                max2 = nums[i]
        return (max - 1) * (max2 - 1)