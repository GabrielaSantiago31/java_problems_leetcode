package twosum;
	
public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
	    for(int i = 0; i < nums.length; i++){
			for(int j = 0; j < nums.length; j++){
				if(i != j) {
					int sum = nums[i] + nums[j];
					if(sum == target) {
						System.out.printf("[" + i + ", " + j + "]"); 
	                    int[] positions = {i, j};
						return positions;
					}
				}
			}
		}
	    return null;
	}    

	public static void main(String[] args) {
		int[] nums = {3,3};
		int target = 6; 
		twoSum(nums, target);	
	            
	}

}