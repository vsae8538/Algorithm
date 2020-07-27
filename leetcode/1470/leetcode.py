class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        res = [0] * len(nums)
        k = 0
        j = n
        for i in range(0,n,1):
            res[k] = nums[i]
            res[k+1] = nums[j]
            k += 2
            j += 1
        return res

        # res = []
        # for i in range(n):
        #     res.append(nums[i])
        #     res.append(nums[i+n])
        # return res