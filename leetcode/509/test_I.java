package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class test {
	public static void main(String[] args) {
		int N = 14;
		System.out.println(fib(N));
	}
	 public static int fib(int N) {
		 int sum = 0;
		 int f1 = 0;
		 int f2 = 1;
		 if(N == 1)
			 return 1;
		 if(N == 0)
			 return 0;
		 else {
			 for(int i = 1;i < N;i++) {
				 sum = f1 + f2;
				 f1 = f2;
				 f2 = sum;
			 }
		 }
		 return sum;
	 }
}
