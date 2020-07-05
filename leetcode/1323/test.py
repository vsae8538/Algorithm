class Solution:
    def maximum69Number (self, num: int) -> int:
        #return int(str(num).replace('6', '9', 1))

        x = [i for i in str(num)]
        for i in range(len(x)):
            if x[i] == '6':
                x[i] = '9'
                break
        return int("".join(x))
