
class leetcode {
    public static void main(String[] args) {

    }
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int tot = 0;
        for(int i = 0;i < grid.length;i++){
            for(int c = 0;c < grid[i].length;c++){
                int j;
                int rMax = 0;
                int cMax = 0;
                for(j = 0;j < grid[i].length;j++){
                    if(grid[i][j] >= rMax)
                        rMax = grid[i][j];
                }
                for(int k = 0;k < grid.length;k++){
                    if(grid[k][c] >= cMax)
                        cMax = grid[k][c];
                }
                int tmp = grid[i][c];
                if(rMax >= cMax){
                    tot += (cMax - tmp);
                }
                else{
                    tot += (rMax - tmp);
                }
            }
        }
        return tot;   
    } 
}
