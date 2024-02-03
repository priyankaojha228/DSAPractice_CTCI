package ArraysandStrings.Leetcode;
/*You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
Return the merged string.*/

public class MergeStringsAlternately {

    public String mergeAlternately(String word1, String word2) {

        int l1 = word1.length();
        int l2  =word2.length();
        int finallen = l1+l2;
        int j=0;
        boolean flag = false;
        StringBuilder str = new StringBuilder();
        int i=0;
        int a=0;
        while(a<finallen){

            if (flag==false && i<l1 ){
                str.append(word1.charAt(i));
                i++;
                if(j==l2){
                    flag=false;
                }
                else{
                    flag = true;
                }

            }
            else if (flag==true && j<l2){
                str.append(word2.charAt(j));
                j++;
                if(i==l1){
                    flag=true;
                }
                else{
                    flag = false;
                }

            }
            a++;


        }

        return str.toString();

    }
}
