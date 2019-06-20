import java.util.Arrays;

class leetcode {
    public static void main(String[] args) {

    } 
    public boolean isMonotonic(int[] A) {
        boolean inc = true,des = true;
        for(int i = 1;i < A.length;i++){
            inc &= A[i-1] <= A[i];
            des &= A[i-1] >= A[i];
        }
        return inc || des;
    }  
}
