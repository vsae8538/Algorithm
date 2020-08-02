import java.lang.reflect.Array;
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

class leetcode {


    public static void main(String[] args) {    

    }
    public String restoreString(String s, int[] indices) {
        char[] res = new char[s.length()];
        for(int i = 0;i < s.length();i++)
            res[indices[i]] = s.charAt(i);
        return new String(res);
    }
}

