package test;

import java.rmi.server.Skeleton;
import java.util.HashSet;
import java.util.Set;

public class test {
	public static void main(String[] args) {
		String t1 = "())";
		String t2 = "(((";
		String t3 = "()";
		String t4 = "()))((";
		String t5 = ")()";
		String t6 = "((())";
		System.out.println(minAddToMakeValid(t1));
		System.out.println(minAddToMakeValid(t2));
		System.out.println(minAddToMakeValid(t3));
		System.out.println(minAddToMakeValid(t4));
		System.out.println(minAddToMakeValid(t5));
		System.out.println(minAddToMakeValid(t6));
	}
    public static int minAddToMakeValid(String S) {
    	int result = 0;
    	char[] cht = S.toCharArray();
    	for(int i = 0;i < S.length();i++) {	
    		if(cht[i] == '(') {
        		for(int j = i;j < S.length();j++) {
        			if(cht[j] == ')') {
        				cht[i] = '0';
        				cht[j] = '0';
        				break;
        			}
        		}
    		}
    	}
    	for(int i = 0;i < cht.length;i++) {
    		if(cht[i] != '0')
    			result++;
    	}
    	return result;
    }
}

//O(n^3)		
