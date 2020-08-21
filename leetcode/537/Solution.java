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


    public String complexNumberMultiply(String a, String b) {
        String n1 = "", n2 = "", ni1 = "", ni2 = "";
        for(int i = 0;i < a.length();i++){
            if(a.charAt(i) == '+'){
                n1 = a.substring(0, i);
                ni1 = a.substring(i+1, a.length()-1);
            }
        }
        for(int i = 0;i < b.length();i++){
            if(b.charAt(i) == '+'){
                n2 = b.substring(0, i);
                ni2 = b.substring(i+1, b.length()-1);
            }
        }
        String cn = String.valueOf(Integer.valueOf(n1) * Integer.valueOf(n2));
        Integer in = Integer.valueOf(ni1) * Integer.valueOf(n2) + Integer.valueOf(ni2) * Integer.valueOf(n1);
        String ins = String.valueOf(in) + "i";
        Integer ii = Integer.valueOf(ni1) * Integer.valueOf(ni2) * -1;
        Integer sum = ii + Integer.valueOf(cn);
        return sum + "+" + ins;
    }

}
