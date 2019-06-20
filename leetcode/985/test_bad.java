package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class test {
	public static void main(String[] args) {
		
    }
    public static int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] result = new int[A.length];
        int sum = 0;
        for(int i = 0;i < queries.length;i++) {
        	A[queries[i][1]] += queries[i][0];
        	for(int j = 0;j < A.length;j++) {
        		if(A[j] % 2 == 0) {
        			sum += A[j];
        		}
        	}
        	result[i] = sum;
        	sum = 0;
        }
        return result;
    }
}
