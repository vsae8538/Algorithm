import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

class leetcode {
    public static void main(String[] args) {    

    }
    //[
    //[3,7,8],
    //[9,11,13],
    //[15,16,17]
    //]
    //[1,10,4,2]
    //[9,3,8,7]
    //[15,16,17,12]
    //[36376,85652,21002,4510],
    //[68246,64237,42962,9974],
    //[32768,97721,47338,5841],
    //[55103,18179,79062,46542]]
    //先找出該列最小的值min,在該行如果出現比min大表示沒有符合.break表示該行沒有比min大的數
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList();
        int m = matrix.length, n = matrix[0].length;
        for(int i = 0; i < m; i++){
            int min = matrix[i][0];
            int k = 0;
            for(int j = 1; j < n; j++){
                if(matrix[i][j] < min) {
                    min = matrix[i][j];
                    k = j;
                }
            }
            int x;
            for(x = 0; x < m; x++){
                if(matrix[x][k] > min) break;
            }
            if(x==m) list.add(min);
        }
        return list;

    }
}

