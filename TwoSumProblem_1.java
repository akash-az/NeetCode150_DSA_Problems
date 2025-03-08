// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

 

// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:

// Input: nums = [3,2,4], target = 6
// Output: [1,2]
// Example 3:

// Input: nums = [3,3], target = 6
// Output: [0,1]


                       // Solution 1 : Use nested loop . TC : O(n^2);

                  // Solution 2 : for each element use binary search. TC : O(nlogn);


// Solution 3 :

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//      int array[] = new int[2];
//      int size = nums.length;

//      HashMap<Integer,Integer> map = new HashMap<>();

//     for(int i=0;i<size;i++){
//         int diff = target - nums[i];

//         if(map.containsKey(diff)){       // check if diff exists,if not then put value in hashmap. 
//             array[0] = map.get(diff);
//             array[1] = i;

                // or
        // return new int[] {map.get(diff),i};     // this way we dont have to declare new array at start.
                
                

//         }
//         else{
//             map.put(nums[i],i);
//         }

//     }


//         return new int[] {};
//     }
// }