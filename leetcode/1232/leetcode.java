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
import java.util.Stack;

class leetcode {
    public static void main(String[] args) {
  
    }
    public boolean checkStraightLine(int[][] coordinates) {
       int x1 =coordinates[1][0]-coordinates[0][0];
       int y1 =coordinates[1][1]-coordinates[0][1];
       for (int i = 2; i < coordinates.length; i++) {
           int x2 =coordinates[i][0]-coordinates[0][0];
           int y2 =coordinates[i][1]-coordinates[0][1];
           if (x1 * y2 != x2 * y1) {
               return false;
           }
       }
       return true;
   }

}
