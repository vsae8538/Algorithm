import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

class Solution {

    public boolean isPalindrome(String s) {
        s = s.replace(" ", "");
        s = s.replace(",", "");
        s = s.replace(".", "");
        s = s.replace(":", "");
        if(s.length() == 0) return true;
        StringBuffer sb = new StringBuffer();
        s = s.toLowerCase();
        for(int i = 0;i < s.length();i++){
            if((s.charAt(i) >= '0' && s.charAt(i) <= '9') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')) sb.append(s.charAt(i));
        }

        if(sb.length() <= 1) return true;
        for(int i = 0,j = sb.length()-1;i < j;i++,j--){
            if(sb.charAt(i) != sb.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
