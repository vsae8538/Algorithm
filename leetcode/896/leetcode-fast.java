import java.util.Arrays;

class leetcode {
    public static void main(String[] args) {

    } 
    public boolean isMonotonic(int[] A) {
        int prev = A[0];
        int isASC = 0;
        for(int i = 1;i < A.length;i++){
            if(isASC == 0){
                if(prev < A[i]) isASC = 1;
                if(prev > A[i]) isASC = 2;
                if(prev == A[i]) continue;
            }
            if(isASC == 1)
                if(prev > A[i]) return false;
            if(isASC == 2)
                if(prev < A[i]) return false;
            prev = A[i];
        }
        return true;
    }  
}
