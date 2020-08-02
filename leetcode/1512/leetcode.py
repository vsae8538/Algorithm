class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        map = {}
        res = 0
        for i in range(0, len(nums), 1):
            if nums[i] in map:
                val = map.get(nums[i])
                res += val
                map[nums[i]] = val+1
            else:
                map[nums[i]] = 1
        return res   
             