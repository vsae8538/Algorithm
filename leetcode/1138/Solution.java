import java.lang.reflect.Array;
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
import java.util.TreeSet;


class Solution {

    /**
     * 
     * "DDDDD!UUUUURRR!DDDDDLLL!"
     * "DDDDD!UUUUURRR!DDDDLLLD!"
     */

    Map<Character,Postition> map;
    public String alphabetBoardPath(String target) {
        buildMap();
        StringBuffer sb = new StringBuffer();
        Postition current = new Postition(0, 0);
        for(char c : target.toCharArray()){
            int row = map.get(c).row;
            int col = map.get(c).col;
            while(current.row != row || current.col != col){
                while(current.row != row && current.row < 6){
                    if(c == 'z' && current.row + 1 == 5 && current.col != 0) //防止邊界超出
                        break;
                    if(current.row < row){
                        current.row += 1;
                        sb.append('D');
                    }else{
                        current.row -= 1;
                        sb.append('U');
                    }
                }  
                while(current.col != col && current.col < 5){
                    if(current.col < col){
                        current.col += 1;
                        sb.append('R');
                    }else{
                        current.col -= 1;
                        sb.append('L');
                    }
                }

            }
            sb.append('!');
        }
        return sb.toString();
    }

    public void buildMap(){
        map = new HashMap<>(){{
            put('a', new Postition(0, 0));put('b', new Postition(0, 1));
            put('c', new Postition(0, 2));put('d', new Postition(0, 3));
            put('e', new Postition(0, 4));
            put('f', new Postition(1, 0));put('g', new Postition(1, 1));
            put('h', new Postition(1, 2));put('i', new Postition(1, 3));
            put('j', new Postition(1, 4));
            put('k', new Postition(2, 0));put('l', new Postition(2, 1));
            put('m', new Postition(2, 2));put('n', new Postition(2, 3));
            put('o', new Postition(2, 4));
            put('p', new Postition(3, 0));put('q', new Postition(3, 1));
            put('r', new Postition(3, 2));put('s', new Postition(3, 3));
            put('t', new Postition(3, 4));
            put('u', new Postition(4, 0));put('v', new Postition(4, 1));
            put('w', new Postition(4, 2));put('x', new Postition(4, 3));
            put('y', new Postition(4, 4));
            put('z', new Postition(5, 0)); 
        }};
    }

    class Postition{
        int row;
        int col;
        Postition(int row,int col){
            this.row = row;
            this.col = col;
        }
    }

}



