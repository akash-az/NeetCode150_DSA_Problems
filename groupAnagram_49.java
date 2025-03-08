// 49. Group Anagrams
// Medium
// 
// Given an array of strings strs, group the anagrams together. You can return the answer in any order.

 

// Example 1:

// Input: strs = ["eat","tea","tan","ate","nat","bat"]

// Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

// Explanation:

// There is no string in strs that can be rearranged to form "bat".
// The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
// The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
// Example 2:

// Input: strs = [""]

// Output: [[""]]

// Example 3:

// Input: strs = ["a"]

// Output: [["a"]]

 

// Constraints:

// 1 <= strs.length <= 104
// 0 <= strs[i].length <= 100
// strs[i] consists of lowercase English letters.






import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>> ansMap = new HashMap<>();

       if(strs.length == 0){                //If the input array is empty, return an empty list immediately.
        return new ArrayList();
       }

    //    if(strs.length == 1){
    //     return new Collections.singletonList(Arrays.asList(strs));
    //    }

        int[] array = new int[26];               //
       for(String s : strs){                      // Iterate through each string s in strs and
        for(char c :s.toCharArray()){              
            Arrays.fill(array,0);              // reset the frequency array (array[]) to 0 for a new word.   
            array[c -'a']++; //Convert the string into a character array.
                              //Update array[c - 'a'] for each character, which increments the frequency at the corresponding index ('a' -> 0, 'b' -> 1, etc.).
            
        }

         StringBuilder sb = new StringBuilder("");
        for(int i=0;i<26;i++){
        sb.append("#");           //The frequency array is converted into a unique string representation (key).
        sb.append(array[i]); //"eat" and "tea" both become:"#1#0#0#0#1#0#0#0#0#0#0#0#0#0#0#0#0#1#0#0#0#0#0#0#0#0"
        }

            String key = sb.toString();
            if(!ansMap.containsKey(key)){                //If the key does not exist, create a new list for it   
                ansMap.put(key,new ArrayList());
            }
                ansMap.get(key).add(s);                  // Add the word to the corresponding list.
            
       }

       
        return new ArrayList<>(ansMap.values());
    }
}