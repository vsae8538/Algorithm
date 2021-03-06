/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package test2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Library {
    public static void main(String[] args) {
    	int[] A = {2,3,3,1};
    	int[] B = {2,1,2,5,3,2};
    	int[] C = {5,1,5,2,5,3,5,4};
    	System.out.println(repeatedNTimes(A));
    	System.out.println(repeatedNTimes(B));
    	System.out.println(repeatedNTimes(C));
    }
    public static int repeatedNTimes(int[] A) {
    	int result = 0;
    	Set<Integer> set = new HashSet<Integer>();
    	boolean bl = false;
    	for(int i = 0;i < A.length;i++) {
    		bl = set.add(A[i]);
    		if(!bl)
    			return A[i];
    	}
    	return result;
    }
}
