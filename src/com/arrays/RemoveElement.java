package com.arrays;

public class RemoveElement {
	
public static int removeElement(int[] nums, int val) {
        
        int n = nums.length;
        for(int i = 0 ; i  < n ; i++){
            if(nums[i] == val){
                nums[i] = -1;
            }
        }
        
        int subCount = 0;
        for(int i = 0 ; i < n ; i ++){
            if(nums[i] != -1){
                nums[subCount++] = nums[i];
            }
        }
        
        return subCount;
     }
   public static void main(String[] args) {
	
}


}
