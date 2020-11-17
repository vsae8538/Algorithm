import java.math.BigDecimal;

public class Array {
    

    public int[][] martixTranspose(int[][] martix){
        int[][] result = new int[martix[0].length][martix.length];
        for(int i = 0;i < martix.length;i++){
            for(int j = 0;j < martix[0].length;j++){
                result[j][i] = martix[i][j];
            }
        }
        return result;
    }

    public int[][] martixMultiply(int[][] A, int[][] B){
        int m = A.length, n = A[0].length, p = B[0].length;
        
        int[][] result = new int[m][p];
        
        for(int i = 0;i < m;i++){
            for(int j = 0;j < p;j++){
                for(int k = 0;k < n;k++){
                    result[i][j] = result[i][j] + A[i][k] + B[k][j];
                }
            }
        }

        return result;
    }

    public boolean martixAdds(int[][] A, int[][] B){
        if(A.length != B.length || A[0].length != B[0].length || A.length == 0 || B.length == 0){
            return false;
        }

        int m = A.length, n = A[0].length;
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                A[i][j] = A[i][j] + B[i][j];
            }
        }

        return true;
    }

    public boolean arrayInsertByIndex(int[] arr, int index, int n){
        if(index < 0 || index >= arr.length){
            return false;
        }
        
        for(int i = arr.length - 1;i > index;i--){
            arr[i] = arr[i-1];
        }
        arr[index] = n;

        return true;
    }
    
}
