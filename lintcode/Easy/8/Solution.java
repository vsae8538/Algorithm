import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;

class Solution {


    public void rotateString(char[] str, int offset) {
        char tmp;
        if(str.length == 0|| str == null){
            return;
        }
        int len = str.length;
        offset = offset >= len ? offset % len : offset;
        while(offset > 0){
            tmp = str[len -1];
            for(int i = len - 1;i > 0;i--){
                str[i] = str[i-1];
            }
            str[0] = tmp;
            offset--;
        }
    }

    /**
     * 
     * 非空間複雜度 O(1)解法
     */
    // public void rotateString(char[] str, int offset) {
    //     if(str.length == 0|| str == null){
    //         return;
    //     }

    //     char[] tmpStr = new char[str.length];
    //     int off = offset % str.length;
    //     int index = off == 0 ? 0 : str.length - off;
    //     for(int i = 0;i < str.length;i++){
    //         tmpStr[i] = str[index];
    //         index = (index + 1) % str.length; 
    //     }
    //     for(int i = 0;i < str.length;i++){
    //         str[i] = tmpStr[i];
    //     }
    // }

}