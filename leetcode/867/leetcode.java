

class leetcode{
    public static void main(String[] args) {
        System.out.println("Hello World\n");
    }
    public int[][] transpose(int[][] A) {
        int[][] M = new int[A[0].length][A.length];
        for(int i = 0;i < A[0].length;i++){
            for(int j = 0;j < A.length;j++){
                M[i][j] = A[j][i];
            }
        }
        return M;
    }
}