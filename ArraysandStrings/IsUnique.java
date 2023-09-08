package ArraysandStrings;
import java.util.*;
public class IsUnique {
    public static boolean approachone(String str){
        if(str.length()>128){
            return false;
        }

        str = str.toLowerCase();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                return false;
            }
            else{map.put(str.charAt(i),1);}

        }
        System.out.println(map);
        return true;
    }
    public static boolean approachtwo(String str){
        if(str.length()>128){
            return false;
        }
        str = str.toLowerCase();
        boolean[] arr = new boolean[128];
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int index = (int)ch - 'a';
            if(arr[index]){
                return false;
            }
            arr[index]=true;
        }
        return true;
    }
    public static boolean approachthree(String str){
        int checker = 0;
        for (int i = 0; i < str.length(); ++i) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) return false;
            checker |= (1 << val);
        }
        return true;
    }
    public static void main(String[] args){

        String str = "hello";
        System.out.println(approachone(str));

    }
}
