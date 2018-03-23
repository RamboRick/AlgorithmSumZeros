package leetcode283;

import java.util.Arrays;

// Time O(n)
// Space O(1)

public class Solution3 {

	public void moveNon( int[] nums){
		int k = 0;// pointer
		for ( int i = 0; i < nums.length; i ++){
			if(nums[i] != 0){
				if ( i != k){
					int temp = nums[i]; 
					nums[i] = nums[k];
					nums[k] = temp; 
					k++;
				}else  { // i = k 
					k++;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tst = { 1,0,2,3,4,0,6,7,8};
		Solution3 testSolution = new Solution3();
		testSolution.moveNon(tst);
		System.out.println(Arrays.toString(tst));
	}

}
