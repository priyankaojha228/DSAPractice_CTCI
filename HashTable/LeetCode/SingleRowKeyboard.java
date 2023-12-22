package HashTable.LeetCode;
import java.util.*;
/*There is a special keyboard with all keys in a single row.
Given a string keyboard of length 26 indicating the layout of the keyboard (indexed from 0 to 25). Initially, your finger is at index 0. To type a character, you have to move your finger to the index of the desired character. The time taken to move your finger from index i to index j is |i - j|.
You want to type a string word. Write a function to calculate how much time it takes to type it with one finger.
Example 1:

Input: keyboard = "abcdefghijklmnopqrstuvwxyz", word = "cba"
Output: 4*/
public class SingleRowKeyboard {
    public int calculateTime(String keyboard, String word) {
        int dist=0;
        int pointerindex=0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<keyboard.length();i++){
            map.put(keyboard.charAt(i),i);
        }
        for(int i=0;i<word.length();i++){
            dist+=Math.abs(pointerindex-map.get(word.charAt(i)));
            pointerindex=map.get(word.charAt(i));
        }
        return dist;

    }

    public int BetterApproach(String keyboard, String word) {
        int[] positions = new int[26];
        for (int i = 0; i < keyboard.length(); i++)
            positions[keyboard.charAt(i) - 'a'] = i;
        int result = 0;
        int current = 0;
        for (int i = 0; i < word.length(); i++) {
            int position = positions[word.charAt(i) - 'a'];
            result += Math.abs(current - position);
            current = position;
        }
        return result;
    }
}
