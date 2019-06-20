import java.util.Arrays;

class leetcode{
    public static void main(String[] args) {
            String S = "loveleetcode";
            String S2 = "baaa";
            char C = 'e';
            char C2 = 'b';
            int[] A =  shortestToChar(S, C);
            for (int a : A) {
                System.out.print(a+" ");
            }
            System.out.println();
            int[] B =  shortestToChar(S2, C2);
            for (int a : B) {
                System.out.print(a+" ");
            }
    }
    public static int[] shortestToChar(String S, char C) {
           int[] result = new int[S.length()];
           Arrays.fill(result, Integer.MAX_VALUE - 1);   
           for(int i = 0;i < S.length();i++){
                for(int j = i;j >= 0;j--){
                    if(S.charAt(j) == C){
                        if(result[i] > i-j){
                            result[i] = i-j;
                        }
                    }
                } 
                for(int k = i;k < S.length();k++){
                    if(S.charAt(k) == C){
                        if(result[i] > k-i){
                            result[i] = k-i;
                        }
                    }
                }
            }
            return result;
    }
}