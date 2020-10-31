import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;


class Solution {

   
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length < 1 || matrix[0].length < 1 || matrix == null) 
            return false;
        int n = matrix.length, m = matrix[0].length - 1;
        int row = 0;
        for(int i = 0;i < n;i++){
            if(target <= matrix[i][m]){
                row = i;
                break;
            }
        }

        int left = 0,right = m;
        while(left <= right){
            int mid = left + ((right - left) >> 1);
            if(matrix[row][mid] == target){
                return true;
            }else if(matrix[row][mid] < target){
                left = mid + 1;
            }else if(matrix[row][mid] > target){
                right = mid - 1;
            }
        }

        return false;
    }
}



