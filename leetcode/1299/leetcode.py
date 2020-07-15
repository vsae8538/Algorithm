class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
     ans = [-1] * len(arr)
     t = arr[-1]
     for i in range(len(arr) - 2, -1, -1):
         ans[i] = t
         t = max(t, arr[i])
    
     return ans