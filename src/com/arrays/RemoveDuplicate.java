package com.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveDuplicate {
	
	public int removeDuplicates(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        int count = 0; 
        int size = 0;
        List<Integer> duplicate = new ArrayList<Integer>();
        for(int i = 0 ; i < n ; i ++){
            if(map.containsKey(nums[i])){
                count = map.get(nums[i])+1;
                map.put(nums[i], count);
            }
            else{
                map.put(nums[i],1);
            }
        }
        
        for(Map.Entry<Integer, Integer> set : map.entrySet()){
            duplicate.add(set.getKey());
        }
        Collections.sort(duplicate);
        for(int i = 0 ; i < duplicate.size(); i ++){
            nums[i] = duplicate.get(i);
        }
        size = duplicate.size();
        return size;
    }

}
