package ArraysandStrings.Leetcode;

/*Given an integer x, return true if x is a
palindrome, and false otherwise.*/
public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        StringBuilder str1 = new StringBuilder(str);
        return(str.equals(str1.reverse().toString()));

    }
    /*Reversing half the digit*/
    public boolean betterApproach(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }

        int reversed = 0;
        int original = x;

        while (x > reversed) {
            reversed = reversed * 10 + original % 10;
            original /= 10;
        }

        return (x == reversed) || (x == reversed / 10);
    }
    public static void main(String[] args) {
        int x = -121;
        StringBuilder str1 = new StringBuilder(Integer.toString(x));
        System.out.println(str1.reverse());
        System.out.println(str1.equals(str1.reverse()));
    }
}
