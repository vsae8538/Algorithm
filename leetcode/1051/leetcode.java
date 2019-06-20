import java.util.Arrays;

class leetcode {
    public static void main(String[] args) {

    } 
    public int heightChecker(int[] heights) {
        int[] ar = new int[heights.length];
        System.arraycopy(heights,0,ar,0,heights.length);
        Arrays.sort(heights);
        int res = 0;
        for(int i = 0; i < heights.length;i++){
            if(heights[i] != ar[i])
                res++;
        }
        return res;
    }
}
