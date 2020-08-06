    def sortedSquares(self, A: List[int]) -> List[int]: 
        for i in range(0,len(A),1):
            A[i] = A[i] * A[i]
        A.sort()
        return A