package test;

import java.util.ArrayList;
import java.util.List;

public class test {
	public static void main(String[] args) {
		int left = 1;
		int right = 22;
		System.out.println(selfDividingNumbers(left, right));
	}
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<Integer>();
        for(int i = left;i <= right;i++) {
    		if(div(i)) {
    			result.add(i);
    		}
        }
    	return result;
    }
    public static boolean div(int num) {
    	int mod;
    	int numTmp = num;
    	if(num < 10)
    		return true;
    	else {
    		while(num > 0) {
    			mod = num % 10;
    			num /= 10;
    			if(mod == 0) {
    				return false;
    			}
    			else if(mod == 1) {
    				continue;
    			}
    			if((numTmp % mod) != 0) {
    				return false;
    			}
    		}
    	}
    	return true;
    }
}

