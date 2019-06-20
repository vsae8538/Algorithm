import java.util.Arrays;

class leetcode {
    public static void main(String[] args) {

    } 
    public static boolean canThreePartsEqualSum(int[] A) {
        int sum = Arrays.stream(A).sum(),cnt = 0, part = 0;
        if(sum % 3 != 0) return false;
        for(int a : A){
            part += a;
            if(part != sum / 3){continue;}  // not the average: sum / 3
            if(++cnt ==  3){ return true;} // find an average, increase the counter.
            part = 0; // reset part.
        }
        return false;
    }  
}
