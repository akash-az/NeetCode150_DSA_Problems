import java.util.*;
// 217. Contains Duplicate
// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
// Example 1:
// Input: nums = [1,2,3,1]
// Output: true
// Explanation:
// The element 1 occurs at the indices 0 and 3.
// Example 2:
// Input: nums = [1,2,3,4]
// Output: false

// Solution : 

// Solution 1 : Brute Force approach :
//  Use nested loop : For every element check if value exists in the array . > TC : O(n^2)

// Solution 2 :  Sort the array :
// After sorting for each element check if next adjacent element is same or not.
// TC: O(nlogn)



// Solution 3 : Use Hash Set : TC : O(n) : Take an empty hashSet , for each element check if its present in the hashSet or not. If yes return true else add element to the set. 

class Solution {
    public boolean containsDuplicate(int[] nums) {

        int size = nums.length;
        if(size < 2){return false;}

        HashSet<Integer> numSet = new HashSet<>();
        
        for(int num : nums){
            if(numSet.contains(num) == true){
                return true;
            }
            else{
                numSet.add(num);
            }
        }

        return false;
        
    }
}

