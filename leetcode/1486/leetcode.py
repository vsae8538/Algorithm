class Solution:
    def xorOperation(self, n: int, start: int) -> int:
        res = start
        for i in range(0, n, 1):
            step = start + 2 * i
            res ^= step
        return res