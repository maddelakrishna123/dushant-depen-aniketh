package dt03012020;

import java.util.Arrays;

import dt04012020.Fact;

public class SortArray1 {

	public static void main(String[] args) {

		int[]  nums = {2,1,4,3,6,5};
  Arrays.parallelSort(nums);
		
		for (int i = 0; i < nums.length; i++) {
			
			System.out.println(nums[i]+" ! = "+Fact.factorial(nums[i]));
			
		}


	}

}
