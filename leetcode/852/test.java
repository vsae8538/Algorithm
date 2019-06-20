package test;

import java.util.ArrayList;
import java.util.List;

public class test {
	public static void main(String[] args) {
		int[] A = {0,1,0};
		int[] B = {0,2,1,0};
		System.out.println(peakIndexInMountainArray(B));
	}
    public static int peakIndexInMountainArray(int[] A) {
    	int result = 0;
    	for(int i = 1;i < A.length;i++) {
    		if(A[i] > A[i-1] && A[i] > A[i+1]) {
    			result = i;
    			break;
    		}
    	}
    	return result;
    }
}

