import java.util.Arrays;

class leetcode {
    public static void main(String[] args) {
        String S = "bbbcccdddaaa";
        int[] widths = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        int[] A = numberOfLines(widths, S);
        for (int a : A) {
            System.out.print(a + " ");
        }
    }
    public static int[] numberOfLines(int[] widths, String S) {
        int[] result = new int[2];
        Arrays.fill(result, 1);
        int rowMax = 0;
        char[] ch = S.toCharArray(); 
        for(int i = 0;i < S.length();i++){
            rowMax += widths[ch[i] - 'a'];
            if(rowMax == 100){
                result[0]++;
                rowMax = 0;
            }
            else if(rowMax > 100){
                result[0]++;
                result[1] = widths[ch[i] - 'a'];
                rowMax = widths[ch[i] - 'a']; 
            }
        }
        result[1] = rowMax;
        return result;
    }
}
