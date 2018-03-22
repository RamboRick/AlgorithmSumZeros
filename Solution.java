package leetcode283;

import java.util.Arrays;

public class Solution {
	public void sumZerox(int[] input){
		int[] numZeros = new int[input.length];
		int j = 0;
		for(int value : input){
			if(value !=0){
				numZeros[j++] = value;
			}
		}
		for (int i =0; i < numZeros.length; i ++){
			input[i] = numZeros[i];
		}		
	}
	
	
	
	public static void main(String[] args) {
		
		int[] tst = { 1,0,2,3,4,0,6,7,8};
		Solution testSolution = new Solution();
		testSolution.sumZerox(tst);
		System.out.println(Arrays.toString(tst));
	}
}
