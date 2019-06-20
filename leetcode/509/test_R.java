package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class test {
	public static void main(String[] args) {
	
	}
	 public static int fib(int N) {
		if(N == 0)
			return 0;
		else if(N == 1)
			return 1;
		else {
			return fib(N - 1) + fib(N - 2);
		}
	 }
}
