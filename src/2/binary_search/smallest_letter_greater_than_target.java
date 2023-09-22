//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

//You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.
//Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.

//        Example 1:
//
//        Input: letters = ["c","f","j"], target = "a"
//        Output: "c"
//        Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.

package binary_search;

public class smallest_letter_greater_than_target {
    public static void main(String[] args) {
        char[] input = {'c','f','j'};
        char aim ='j';
        System.out.println(nextGreatestLetter(input, aim));

    }
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end){
            int mid = start -( (start - end) / 2);
             if (letters[mid] < target) {
                start = mid +1;
            }
            else if (letters[mid] > target) {
                end = mid -1;
            }

        }
        return letters[start % letters.length];
    }
}
