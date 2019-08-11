import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

class leetcode {
    public static void main(String[] args) {
        System.out.println('Z' - 'A');
    }
    //迭代 100%速度 + 100%空間
    public int tribonacci(int n) {
        if(n <= 0) return 0;
        int n0 = 0,n1 = 1,n2 = 1;
        for(int i = 3;i <= n;i++){
            int tmp = n2;
            n2 = n0 + n1 + n2;
            n0 = n1;
            n1 = tmp;
        }
        return n2;    
    }

    //遞歸 超出時間限制
    /*public int tribonacci(int n) {
        if(n <= 0){
            return 0;
        }
        else if(n == 1 || n == 2){
            return 1;
        }else{
            return tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
        }
    } */ 
}