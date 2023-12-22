import java.util.*;
public class Main {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        StringBuilder str = new StringBuilder();
        String[] seq = s.split(" ");
        for(int i=0;i<k;i++){
            str.append(seq[i]);
            str.append(" ");
        }
        String str1 = str.toString();
        System.out.println(str1.substring(0,str1.length()));


    }


}


