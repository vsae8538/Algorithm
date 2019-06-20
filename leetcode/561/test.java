package test;

import java.util.Arrays;


public class test {
	public static void main(String[] args) {
		int[] nums = {1,4,3,2};
		int[] nums2 = {5,0,2,4};
		System.out.println(arrayPairSum(nums2));
	}
    public static int arrayPairSum(int[] nums) {
        int result = 0;
        Arrays.sort(nums);
        int i = 1;
        while(i < nums.length) {
        	result += min(nums[i-1], nums[i]);
        	i += 2;
        }
    	return result;
    }
    public static int min(int a,int b) {
    	if(a > b) {
    		return b;
    	}else if(a < b) {
    		return a;
    	}else {
			return a;
		}
    }
}


/*
        Set<Integer> gc = new HashSet<Integer>();
        int i = 0;
        while(i < (nums.length / 2)) {
        	if(!gc.contains(nums[i])) {
        		result += min(nums[i], nums[i]+1);
        		gc.add(nums[i]);
        		gc.add(nums[i]+1);
        	}
        }
*/
