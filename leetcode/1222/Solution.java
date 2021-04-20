import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
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
import java.util.Map.Entry;

class Solution{

    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        List<List<Integer>> res = new LinkedList<>();
        boolean[][] flag = new boolean[8][8];
        for(int[] queen : queens)
            flag[queen[0]][queen[1]] = true;
        //8个方向                         右     左    上    下    右上   右下   左上    左下   
        int[][] direction = new int[][]{{1,0},{-1,0},{0,1},{0,-1},{1,1},{1,-1},{-1,1},{-1,-1}};
        
        for(int i = 0;i < direction.length;i++){
            for(int x = king[0],y = king[1];x >= 0 && x < 8 && y >= 0 && y < 8;x += direction[i][0],y += direction[i][1]){
                if(flag[x][y]){
                    res.add(Arrays.asList(x,y));
                    break;
                }
            }
        }
        
        return res;
    }

}
