class Solution:
    def average(self, salary: List[int]) -> float:
        salary.sort()
        res = 0
        avg = len(salary) - 2
        for i in range(1,len(salary)-1, 1):
            res += salary[i] 
        return float(res / avg)