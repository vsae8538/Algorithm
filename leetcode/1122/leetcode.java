import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

class leetcode {
    public static void main(String[] args) {
        System.out.println('Z' - 'A');
    }
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] tmp = new int[arr1.length];
        Arrays.fill(tmp, 0);
        int n = 0;
        int status = 1;
        for(int i = 0;i < arr1.length;i++){
            status = 1;
            for(int j = 0;j < arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    status = 0;
                    break;
                }
            }
            if(status != 0){
                tmp[n++] = arr1[i];    
            }
        }
        int[] res = new int[arr1.length];
        int ren = 0;
        for(int i = 0;i < arr2.length;i++){
            for(int j = 0;j < arr1.length;j++){
                if(arr2[i] == arr1[j]){
                    res[ren++] = arr2[i];
                }
            }
        }
        Arrays.sort(tmp,0, n);
        for(int i = ren,ns = 0;ns < n;i++,ns++){
            res[i] = tmp[ns];
        }
        return res;
    }
}