import java.util.ArrayList;
import java.util.List;



class leetcode {
    public static void main(String[] args) {

    }
    public int countPrimeSetBits(int L, int R) {
        int resCnt = 0;
        List<String> list = new ArrayList<String>();
        for(int i = L;i <= R;i++){
            list.add(Integer.toBinaryString(i));
        }
        for(int i = 0;i < list.size();i++){
            int cnt = 0;
            char chs[] = list.get(i).toCharArray();
            for(int j = 0;j < chs.length;j++){
                if(chs[j] == '1'){
                    cnt++;
                }
            }
            if(isPrime(cnt)){
                resCnt++;
            }
        }
        return resCnt;
    }
    public boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        else if(n == 2){
            return true;
        }
        else{
            for(int i = 2;i < n;i++){
                if(n % i == 0)
                    return false;
            }
        }
        return true;
    }
}
