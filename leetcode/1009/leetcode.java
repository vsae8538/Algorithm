import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


class leetcode {
    public static void main(String[] args) {
     
    }
    public int bitwiseComplement(int N) {
        if(N == 0)
            return 1;
        String s = Integer.toBinaryString(N);
        char[] chs = s.toCharArray();
        for(int i = 0;i < chs.length;i++){
            if(chs[i] == '0')
                chs[i] = '1';
            else
                chs[i] = '0';
        }
        int res = 0;
        int n = 1;
        for(int i = chs.length - 1;i >= 0;i--){
            if(chs[i] == '1'){
                res += n;
            }
            n *= 2;
        }
        return res;   
    }
}
