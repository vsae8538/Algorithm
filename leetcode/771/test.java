package test;

import java.util.HashMap;
import java.util.Map;

public class test {
	
	public static void main(String[] args) {
		String S = "aAAbbbb";
		String J = "aA";
		System.out.println(numJewelsInStones(J, S));
	}
    public static int numJewelsInStones(String J, String S) {
        //int result = 0;
        int i = 0;
        int sum = 0;
        char[] Sch = S.toCharArray();
        char[] Jch = J.toCharArray();
        while(i < S.length()) {
        	for(int j = 0;j < J.length();j++) {
        		if(Sch[i] == Jch[j]) {
        			sum += 1;
        		}
        	}
        	i++;
        }
    	return sum;
    }
}

