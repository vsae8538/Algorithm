

class leetcode {
    public static void main(String[] args) {

    }    
    //暴力法 超出時間限制
    public int[] fairCandySwap(int[] A, int[] B) {
        int total = 0;
        int[] res = new int[2];
        for(int i = 0;i < A.length;i++) total += A[i];
        for(int i = 0;i < B.length;i++) total += B[i];
        total /= 2;
        int sum = 0;
        
        int isAns = 0;
        for(int i = 0;i < A.length;i++){
            for(int j = 0;j < B.length;j++){
                int tmp = A[i];
                A[i] = B[j];
                sum = 0;
                for(int k = 0;k < A.length;k++){
                    sum += A[k];
                }
                if(sum == total){
                    res[0] = tmp;
                    res[1] = B[j];
                    isAns = 1;
                    break;
                }  
                A[i] = tmp;
            }
            if(isAns == 1)
                break;
        }
        return res;
    }
}
