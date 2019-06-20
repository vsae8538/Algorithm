import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.print.DocFlavor.STRING;

class leetcode {
    public static void main(String[] args) {

    }
    public boolean isToeplitzMatrix(int[][] martix) {
        for(int i = 0;i < martix.length - 1;i++){
            for(int j = 0;j < martix[i].length - 1;j++){
                if(martix[i][j] != martix[i+1][j+1]){
                    return false;
                }
            }   
        }
        return true;
    }
}
