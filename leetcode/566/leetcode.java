

class leetcode {
    public static void main(String[] args) {

    }
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int maxEle = nums.length * nums[0].length;
        if(maxEle != r * c){
            return nums;
        }else{
            int[][] newMatrix = new int[r][c];
            int p = 0;
            int[] numCnt = new int[nums.length * nums[0].length];
            for(int i = 0;i < nums.length;i++){
                for(int j = 0;j < nums[i].length;j++){
                    numCnt[p] = nums[i][j];
                    p++;
                }
            }
            p = 0;
            for(int i = 0;i < r;i++){
                for(int j = 0;j < c;j++){
                    newMatrix[i][j] = numCnt[p];
                    p++;
                }
            }
            return newMatrix;
        }
    }
}
