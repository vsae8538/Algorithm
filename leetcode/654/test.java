package test;

import java.util.ArrayList;
import java.util.List;


public class test {
	public static void main(String[] args) {
		int[] nums ={3,2,1,6,0,5};
		
	}
	public static TreeNode constructMaximumBinaryTree(int[] nums) {
	        return TreeFunc(nums,0,nums.length);
	}
	public static TreeNode TreeFunc(int[] nums,int startIndex,int endIndex){
		if(endIndex == startIndex) {
			return null;
		}
		int max = Max(nums, startIndex, endIndex);
		TreeNode t = new TreeNode();
		t.val = nums[max];
		t.left = TreeFunc(nums, startIndex, max);
		t.right = TreeFunc(nums, max+1, endIndex);
		return t;
		
	}
	public static int Max(int[] nums,int startIndex,int endIndex) {
		int max = startIndex;
		for(int i = startIndex;i < endIndex;i++) {
			if(nums[i] > nums[max])
				max = i;
		}
		return max;
	}
}


