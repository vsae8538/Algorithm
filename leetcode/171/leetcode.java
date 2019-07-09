import java.util.ArrayList;
import java.util.List;

class leetcode {
    public static void main(String[] args) {
        System.out.println('Z' - 'A');
    }
    public int titleToNumber(String s) {
        int ans = 0;
        for(int i = 0;i < s.length();i++){
            int num = s.charAt(i) - 'A' + 1;
            ans = ans * 26 + num;
        }
        return ans;
    }
}