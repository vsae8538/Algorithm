import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class leetcode {
    public static void main(String[] args) {

    }
    public int countBinarySubstrings(String s) {
        int prevRunlenth = 0,curRunLength = 1,res = 0;
        for(int i = 1;i < s.length();i++){
            if(s.charAt(i) == s.charAt(i - 1)) curRunLength++;
            else{
                prevRunlenth = curRunLength;
                curRunLength = 1;
            }
            if(prevRunlenth == curRunLength) res++;
        }
        return res;   
    }
}