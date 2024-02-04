package ArraysandStrings.Leetcode;
/*Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false*/

public class isSubsequence {
    public boolean isSubsequence(String s, String t) {

        int len=0;
        int count=0;
        boolean flags=false;
        boolean flagt=false;

        if (s.length()==0 && t.length()==0){
            return true;
        }

        if(t.length()==0){
            return false;
        }
        if(s.length()>t.length()){
            len = s.length();
            flags=true;
        }
        else{
            len = t.length();
            flagt=true;
        }
        int a=0;
        for(int i=0;i<len;i++){
            if(flags && a<t.length()){
                if(s.charAt(i)==t.charAt(a)){
                    count++;
                    a++;
                }
            }
            else if(flagt && a<s.length()){
                if(t.charAt(i)==s.charAt(a)){
                    count++;
                    a++;
                }
            }


        }
        if(flags && count==t.length()){
            return true;
        }
        else if(flagt && count==s.length()){
            return true;
        }

        return false;


    }
}
