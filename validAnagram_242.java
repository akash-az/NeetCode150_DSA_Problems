// 242. Valid Anagram :
// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

 

// Example 1:

// Input: s = "anagram", t = "nagaram"

// Output: true

// Example 2:

// Input: s = "rat", t = "car"

// Output: false

 

// Constraints:

// 1 <= s.length, t.length <= 5 * 104
// ** s and t consist of lowercase English letters.

// Solution 1: create a 26 digit character array bcus alphabets are only 26 and all letters are small, > increase value in array at array[characer] for 
// each character in string s and decrese the value for string t . after loop completes all entries in array should be 0 else return false.            
class Solution1 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int array[] = new int[26]; // bcus there are only 26 alphabets
        for(int i=0; i<s.length(); i++){
            array[s.charAt(i) - 'a']++; // s and t only contains small letters. // increase the value in array for each character in s
            array[t.charAt(i) - 'a']--; // decrease the value for each character in string t 
        } // after this if both string had same character all values in array will be zero.  

        for(int num : array){
            if(num!=0){
                return false;
            }
        }

        return true;
    }
}



// Solution 2: sort the characters in string and use equals() method to compare.

class Solution2 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

       
        char[] array1 = s.toCharArray(); // convert into character array
        char[] array2 = t.toCharArray();

        Arrays.sort(array1); // sort the array
        Arrays.sort(array2);
        String s1 = new String(array1); //   recreate a string with sorted characters
        String s2 = new String(array2);
        if(s1.equals(s2) != true){         // compare both strings.
            return false;
        }



        return true;


    }
}