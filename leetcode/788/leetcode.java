import java.util.Arrays;
import java.util.List;

class leetcode{
    public static void main(String[] args) {
        int t = 857;
        System.out.println(rotatedDigits(857));
    }
    public static int rotatedDigits(int N) {
        int[] value = new int[]{0,0,1,-1,-1,1,1,-1,0,1};
        int res = 0;
        for(int i = 1;i <= N;i++){
            int t = i,diff = 0;
            while(t > 0){
                int mod = t % 10;
                if(value[mod] == -1){
                    diff = -1;
                    break;
                }
                diff += value[mod];
                t /= 10;
            }
            if(diff > 0)
                res++;
        }
        return res;
    }
}