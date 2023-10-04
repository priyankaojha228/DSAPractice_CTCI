import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] arr = {12,111,1,45,4567};
        int count=0;
        for(int i=0;i<arr.length;i++){
            String str = Integer.toString(arr[i]);
            if(str.length()%2==0){
                count+=1;
            }
        }
        System.out.println(count);
    }


}


