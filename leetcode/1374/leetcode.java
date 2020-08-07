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
import java.util.Stack;

class leetcode {


    public static void main(String[] args) {    

    }
    public String generateTheString(int n) {
        StringBuffer res = new StringBuffer();
        if(n % 2 == 0){
            for(int i = 0;i < n - 1;i++)
                res.append('a');
            res.append('b');
        }else{
            for(int i = 0;i < n;i++)
                res.append('a');
        }
        return res.toString();
    }

}

