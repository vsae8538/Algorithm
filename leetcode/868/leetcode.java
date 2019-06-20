import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class leetcode {
    public static void main(String[] args) {
   
    }
    public int binaryGap(int N) {
        String bin = Integer.toBinaryString(N);
        int max = 0;
        for(int i = 0;i < bin.length();i++){
            if(bin.charAt(i) == '1'){
                for(int j = i + 1;j < bin.length();j++){
                    if(bin.charAt(j) == '1'){
                        max = Math.max(max, j - i);
                        break;
                    }
                }
            }
        }
        return max;
    }
}
