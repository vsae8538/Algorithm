class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # TLE ->
        # ans = []
        # for i in range(0, len(nums)-1, 1):
        #     for j in range(i+1, len(nums), 1):
        #         sum = nums[i] + nums[j]
        #         if sum == target:
        #             ans.append(i)
        #             ans.append(j)
        #             break
        # return ans

        # [3,2,4]
        # 6
        # 6 - 3 = 3, put 3 and 3 index
        # 6 - 2 = 4 put 2 and 2 index
        # 6 - 4 = 2 -> map contain key 2 -> return [2,4] index
        ans = {}
        if len(nums) <= 1:
            return ans
        else:
            for i in range(len(nums)):
                if nums[i] in ans:
                    return [ans[nums[i]], i]
                else:
                    ans[target - nums[i]] = i
        

