package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class test {
	public static void main(String[] args) {
		int[] A = {4,2,5,7};
		int[] B = {3,4};
		int[] r = sortArrayByParityII(A);
		for (int i : r) {
			System.out.print(i + " ");
		}
	}
    public static int[] sortArrayByParityII(int[] A) {
        int[] result = new int[A.length];
        List<Integer> odd = new ArrayList<Integer>();
        List<Integer> even = new ArrayList<Integer>();
        for(int i = 0;i < A.length;i++) {
        	if(IsEven(A[i])) {
        		odd.add(A[i]);
        	}else {
        		even.add(A[i]);
			}
        }
        for(int i = 0,o = 0,e = 0;i < A.length;i++) {
        	if(i % 2 == 0) {
        		result[i] = odd.get(o);
        		o++;
        	}else {
				result[i] = even.get(e);
				e++;
			}
        }
        return result;
    }
    public static boolean IsEven(int n) {
    	if(n % 2 == 0)
    		return true;
    	else
    		return false;
    }
}

//O(n^2)