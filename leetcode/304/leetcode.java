import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

class leetcode {


    public static void main(String[] args) {    

    }
    class NumMatrix {

        public int[][] arr;

        public NumMatrix(int[][] matrix) {
            if(matrix.length == 0 || matrix == null){
                arr = null;
            }else{
                arr = new int[matrix.length][matrix[0].length];
                for(int i = 0;i < matrix.length;i++){
                    for(int j = 0;j < matrix[0].length;j++){
                        arr[i][j] = matrix[i][j];
                    }
                }
            }
        }
        
        public int sumRegion(int row1, int col1, int row2, int col2) {
            int res = 0;
            if(arr != null){       
                for(int i = row1;i <= row2;i++){
                    for(int j = col1;j <= col2;j++){
                        res += arr[i][j];
                    }
                }
            }

            return res;
        }
    }
}

