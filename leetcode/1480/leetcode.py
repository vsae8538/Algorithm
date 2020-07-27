class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        res = [0] * len(nums)
        for i in range(0, len(nums), 1):
            sum = 0
            for j in range(0, i+1, 1):
                sum += nums[j]
            res[i] = sum

        return res