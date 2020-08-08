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
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] a = new int[1001];
        int[] b = new int[1001];
        for(int i = 0; i < target.length;i++){
            a[target[i]]++;
            b[arr[i]]++;
        } 
        for(int i = 0;i < a.length;i++){
            if(a[i] != b[i])
                return false;
        }

        return true;
    }

}

