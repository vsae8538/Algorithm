import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

class leetcode {
    public static void main(String[] args) {
        
    }
    public int[][] diagonalSort(int[][] mat) {
            //氣泡排序
            //每欄向右下方排序
        int row = mat.length;
        int col = mat[0].length;

        for(int i = 0; i < row - 1; i++)
        {
            for(int j = 0; j < row - 1 - i; j++)
            {
                // 比較 mat[j][k]和mat[j + 1][k + 1]
                for(int k = 0; k < col - 1; k++)
                {
                    if(mat[j][k] > mat[j + 1][k + 1])
                    {
                        int tmp = mat[j][k];
                        mat[j][k] = mat[j + 1][k + 1];
                        mat[j + 1][k + 1] = tmp;
                    }
                }
            }

        } 
        return mat;
    }
}   