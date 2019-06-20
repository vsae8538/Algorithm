package test;

import java.util.HashMap;
import java.util.Map;

public class test {
	
	public static void main(String[] args) {
		String ss = " 0(()())(())(()(()))";
		System.out.println(removeOuterParentheses(ss).toString());
	}
    public static String removeOuterParentheses(String S) {
    	        int count = 0;
    	        int last = 0;
    	        StringBuilder sb = new StringBuilder();
    	        for(int i = 0; i < S.length(); ++i) {
    	            if(S.charAt(i) == '(') {
    	                count++;
    	            }
    	            else {
    	                count--;
    	                if(count == 0) {
    	                    sb.append(S.substring(last+1, i));
    	                    last = i + 1;
    	                }
    	            }
    	        }
    	        return sb.toString();
    	    }
}

