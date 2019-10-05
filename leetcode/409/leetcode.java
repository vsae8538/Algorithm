import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

class leetcode {
    public static void main(String[] args) {    
        System.out.print("Hello World \n");
    }
    public int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        for(char c : s.toCharArray()){ 
            if(set.contains(c)) //排除重複
                set.remove(c);
            else
                set.add(c);
        }
        int odd = set.size();
        /*
            若odd = 0，表示所有字母均為複數，不存在中間數 例如:aabdd的b
            若odd > 0,存在任一中間數，因此減去1
            最終由s的長度減去"單一字母總數"，即為結果。
            注意:單一字母總數必須扣除一，因為必須要給定一個任一中間數
        */
        return s.length() - (odd == 0 ? 0 : odd - 1); 
    }
    
}

