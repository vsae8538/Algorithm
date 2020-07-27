class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        maxNum = max(candies)
        res = []
        for i in range(0, len(candies), 1):
            if(maxNum <= candies[i] + extraCandies):
                res[i] = true
            else:
                res[i] = false

        return res