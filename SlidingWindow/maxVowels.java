package SlidingWindow;
/*Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.

Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.

Example 1:

Input: s = "abciiidef", k = 3
Output: 3
Explanation: The substring "iii" contains 3 vowel letters.*/
public class maxVowels {
    public int maxVowels(String s, int k) {
        int count=0;
        int max=0;
        int prevcount=0;
        for(int i=0;i<k;i++){
            char ch = s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count+=1;
            }
        }
        prevcount=count;
        if(count>max){
            max=count;
            count=0;
        }
        for(int i=1;i<s.length();i++){
            if((i+k-1)<s.length()){
                char ch = s.charAt(i+k-1);
                char prev = s.charAt(i-1);
                if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')&&!(prev=='a'||prev=='e'||prev=='i'||prev=='o'||prev=='u')){
                    count=prevcount+1;

                }
                else if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')&&(prev=='a'||prev=='e'||prev=='i'||prev=='o'||prev=='u')){
                    count=prevcount;

                }
                else if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')&&(prev=='a'||prev=='e'||prev=='i'||prev=='o'||prev=='u')){
                    count=prevcount-1;

                }
                else{
                    count=prevcount;
                }
                prevcount=count;
                if(count>max){
                    max=count;
                }
                count=0;
            }
        }
        return max;

    }
}
