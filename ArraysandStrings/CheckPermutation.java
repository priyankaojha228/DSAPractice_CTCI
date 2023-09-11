package ArraysandStrings;

import java.util.*;
public class CheckPermutation {

    public static boolean approachone(String s1, String s2){

        if(s1.length()!=s2.length()){
            return false;
        }
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            if(map1.containsKey(s1.charAt(i))){
                map1.put(s1.charAt(i),map1.get(s1.charAt(i))+1);
            }
            else{
                map1.put(s1.charAt(i),1);
            }
        }
        for(int j=0;j<s2.length();j++){
            if(map2.containsKey(s2.charAt(j))){
                map2.put(s2.charAt(j),map2.get(s2.charAt(j))+1);
            }
            else{
                map2.put(s2.charAt(j),1);
            }
        }
        if(map1.equals(map2)){
            return true;
        }
        return false;
    }

    public static boolean approachtwo(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        int[] arr = new int[128];
        for(int i=0;i<str1.length();i++){
            char ch = str1.charAt(i);
            arr[ch]++;
        }
        for(int i=0;i<str2.length();i++){
            char ch = str2.charAt(i);
            arr[ch]--;
            if(arr[ch]<0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){

        System.out.println(approachtwo("abc","pqr"));

    }
}
