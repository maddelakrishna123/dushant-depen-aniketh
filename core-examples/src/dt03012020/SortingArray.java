package dt03012020;

public class SortingArray {

	public static void main(String[] args) {


    int[]  nums = {2,1,4,3,6,5};

// 1 2 3 4 5 6
   // 2 > 1  
    for(int i =0; i<nums.length;i++)
    {
    	for(int j =1;j<nums.length-1;j++)
    	{
    		
    		if(nums[j-1]>nums[j]) {
    			
    			int temp = nums[j-1];
    			
    			nums[j-1] = nums[j];
    			nums[j] = temp;
    		}
    		
    	}
    }
    
    
    
    
    for (int i = 0; i < nums.length; i++) {
    	
    	
		System.out.println(nums[i]);
	}
    
    
    
	}

}
