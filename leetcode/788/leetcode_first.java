import java.util.Arrays;
import java.util.List;

class leetcode{
    public static void main(String[] args) {
        int t = 857;
        System.out.println(rotatedDigits(857));
    }
    public static int rotatedDigits(int N) {
        Integer[] rotated = {2,5,6,9};
        List<Integer> list = Arrays.asList(rotated);
        Integer[] rotated2 = {2,5,6,9,0,1,8};
        List<Integer> list2 = Arrays.asList(rotated2);
        int res = 0,status = 0;
        for(int i = 0;i <= N;i++){
            if(i < 10){
                if(list.contains(i)) res++;
            }else{
                int t = i;
                while(t > 0){
                    int m = t % 10;
                    if(list2.contains(m)){
                        if(list.contains(m)){   
                            status = 1;
                        }
                    }
                    else{
                        status = 0;
                        break;
                    }
                    t /= 10;
                }
                if(status == 1)
                    res++;
                status = 0;
            }
        }
        return res;
    }
}