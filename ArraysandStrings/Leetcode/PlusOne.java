package ArraysandStrings.Leetcode;
/*You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].*/
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int idx = n - 1; idx >= 0; --idx) {
            if (digits[idx] == 9) {
                digits[idx] = 0;
            }
            else {
                digits[idx]++;
                return digits;
            }
        }

        digits = new int[n + 1];
        digits[0] = 1;
        return digits;
    }
}
