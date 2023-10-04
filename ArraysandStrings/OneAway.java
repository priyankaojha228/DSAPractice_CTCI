package ArraysandStrings;
import java.math.*;
public class OneAway {
    public static boolean approachone(String str1, String str2){
        if(Math.abs(str1.length()-str2.length())>1){
            return false;
        }
        int count=0;
        int[] arr = new int[128];
        for(int i=0;i<str1.length();i++){
            char ch = str1.charAt(i);
            arr[ch]+=1;
        }
        for(int i=0;i<str2.length();i++){
            char ch = str2.charAt(i);
            arr[ch]-=1;
            if(arr[ch]<0){
                count+=1;
            }
        }
        if(count>1){
            return false;
        }
        return true;


    }
    public static void main(String[] args){
        System.out.println(approachone("pale","bake"));

    }
}
