

class leetcode {
    public static void main(String[] args) {
        int[][] ary = {{0,1,0,0},
        {1,1,1,0},
        {0,1,0,0},
        {1,1,0,0}};
        System.out.println(islandPerimeter(ary));   
    }
    public static int islandPerimeter(int[][] grid) {
        int sum = 0;
        for(int i = 0;i < grid.length;i++){
            for(int j = 0;j < grid[i].length;j++){
                if(grid[i][j] == 1){
                    if(j - 1 < 0){ //left
                        sum++;
                    }
                    else if(j - 1 >= 0){ 
                        sum += isWater(grid[i][j-1]);
                    }

                    if(j + 1 > grid[i].length - 1){ //right
                        sum++;
                    }
                    else if(j + 1 <= grid[i].length){ 
                        sum += isWater(grid[i][j+1]);
                    }

                    if(i - 1 < 0){ //top
                        sum++;
                    }
                    else if(i - 1 >= 0){ 
                        sum += isWater(grid[i-1][j]);
                    }
                    
                    if(i + 1 > grid.length - 1){ //bottom
                        sum++;
                    }
                    else if(i + 1 <= grid.length - 1){
                        sum += isWater(grid[i+1][j]);
                    }
                    System.out.println(sum);
                }
            }
        }
        return sum;    
    }

    public static int isWater(int grid){
        if(grid == 0){
            return 1;
        }else{
            return 0;
        }
    }
}
