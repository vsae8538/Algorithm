import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

class leetcode {
    public static void main(String[] args) {
        System.out.println('Z' - 'A');
    }
    public int numRookCaptures(char[][] board) {
        int Ri = 0,Rj = 0;
        int res = 0;
        for(int i = 0;i < board.length;i++){
            for(int j = 0;j < board[i].length;j++){
                if(board[i][j] == 'R'){
                    Ri = i;
                    Rj = j;
                    break;
                }
            }
        }
        //System.out.println(Ri + " "+Rj);
        //Top shift
        for(int i = Ri;i > 0;i--){
            if(board[i][Rj] == 'B') break;
            if(board[i][Rj] == 'p'){
                res++;
                break;
            }
        }    
        //bottom shift
        for(int i = Ri;i < board.length;i++){
            if(board[i][Rj] == 'B') break;
            if(board[i][Rj] == 'p'){
                res++;
                break;
            }
        }  
        //left shift
        for(int j = Rj;j > 0;j--){
            if(board[Ri][j] == 'B') break;
            if(board[Ri][j] == 'p'){
                res++;
                break;
            }
        } 
        //right shift
        for(int j = Rj;j < board[0].length;j++){
            if(board[Ri][j] == 'B') break;
            if(board[Ri][j] == 'p'){
                res++;
                break;
            }
        } 
        return res;
    }
}