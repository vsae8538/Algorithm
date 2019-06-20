package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class test {
	public static void main(String[] args) {
		
    }
    public static int[] sumEvenAfterQueries(int[] A, int[][] queries) {
    	int[] result = new int[queries.length];
    	int sum = 0;
    	for (int i : A) {
			if(i % 2 == 0)
				sum += i;
		}
    	for(int i = 0;i < queries.length;i++) {
    		if(A[queries[i][1]] % 2 == 0) {
    			sum -= A[queries[i][1]]; 
    		}
    		A[queries[i][1]] += queries[i][0];
    		if(A[queries[i][1]] % 2 == 0) {
    			sum += A[queries[i][1]]; 
    		}
    		result[i] = sum;
    	}
    	
    	return result;
    }
}
