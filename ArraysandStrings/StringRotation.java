package ArraysandStrings;
import java.util.*;

public class StringRotation {
    public static boolean approachone(String str, String str2){
        String str3 = str2+str2;
        if(str3.contains(str)){
            return true;
        }
        return false;
    }
    public static void main(String[] args){


        System.out.println(approachone("erbottlewat","waterbottle"));

    }
}
