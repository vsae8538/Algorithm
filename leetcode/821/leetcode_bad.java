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
            int j = 0,k = 0,dist = 0;   
            for(int i = 0;i < S.length();i++){
                if(i - 1 > 0){
                    k = i;
                }
                if(i + 1 <= S.length()){
                    j = i;
                }
                int bound = 0;
                while(k >= 0 && j < S.length()){
                    if(S.charAt(k) == C){
                        dist = i - k;
                        result[i] = min(result[i],dist);
                    }
                    if(S.charAt(j) == C){
                        dist = j - i;
                        result[i] = min(result[i],dist);      
                    }
                    if(bound == 1 && k == 0){
                        break;
                    }
                    if(k != 0)
                        k--;
                    if(j < S.length() && bound == 0)                  
                        j++;
                    if(j == S.length()){
                        bound = 1;
                        j = S.length() - 1;
                    }
                }
            }
            return result;
    }
    public static int min(int a,int b){
        if(a < b){
            return a;
        }
        return b;
    }
}