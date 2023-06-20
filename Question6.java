// 💡 **Q6.** Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

// **Example 1:**
// Input: nums = [1,2,3,1]

// Output: true

import java.util.HashSet;
import java.util.Set;

public class Question6 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet()<Integer> (); 
        for(int i=0;i < nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }
}
