class Solution:
    def restoreString(self, s: str, indices: List[int]) -> str:
        res = [0] * len(s)
        for i in range(0,len(s), 1):
            res[indices[i]] = s[i]
        return ''.join(res)
