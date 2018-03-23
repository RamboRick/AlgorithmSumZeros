package leetcode283;

import java.util.Arrays;

// time: O(n)
// Do not use extra space: O(1) 


public class Solution2 {
	
	public void moveZeros( int[] nums){
		int k = 0;
		for ( int i = 0; i < nums.length; i ++){
			if(nums[i] != 0){
				nums[k++] = nums[i]; // k++ equal to nums[k] = nums[i] then k = k+1; 
			}
		}
		for ( int i = k; i < nums.length; i ++ ){
			nums[i] = 0;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tst = { 1,0,2,3,4,0,6,7,8};
		Solution2 testSolution = new Solution2();
		testSolution.moveZeros(tst);
		System.out.println(Arrays.toString(tst));
	}

}
