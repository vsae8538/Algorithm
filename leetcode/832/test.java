package test;

import java.util.HashMap;
import java.util.Map;

public class test {
	
	public static void main(String[] args) {
		 int[][] A = {{1,1,0},{1,0,1},{0,0,0}};
		 int[][] A2 = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
		 
		   int[][] B = flipAndInvertImage(A2);
		   for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B[i].length; j++) {
				System.out.print(B[i][j] + " ");
			}
			System.out.println();
		   }
	}

	public static int[][] flipAndInvertImage(int[][] A) {
		//step.1
		int tmp = 0;
		for(int i = 0;i < A.length;i++) {
			System.out.println(A[i].length);
		  for(int k = A[i].length - 1,j = 0;j < k;k--,j++) {
		    	if(A[i][j] != A[i][k]) {
		    		tmp = A[i][j];
		    		A[i][j] = A[i][k];
		    		A[i][k] = tmp;
 		    	}
		    }
		 }
		 //step.2
		 for(int i = 0;i < A.length;i++) {
		   for(int j = 0;j < A[i].length;j++) {
				if(A[i][j] == 0) {
					A[i][j] = 1;
				}else{
					A[i][j] = 0;
				}
		    }
		  }
		return A;
	}
}

