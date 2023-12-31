import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] nums = {3,6,1,0};
        int firstmax = Integer.MIN_VALUE;
        int firstind=0;
        int secondmax = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>firstmax){
                firstmax=nums[i];
                firstind=i;
            }
        }
        System.out.println(firstmax);
        for(int i=0;i<nums.length;i++){
            if((nums[i]>secondmax) && (secondmax<firstmax)){
                secondmax=nums[i];
                System.out.println(secondmax);
            }
        }
        //System.out.println(secondmax);
        if(firstmax>=(2*secondmax)){
            System.out.println(firstind);
        }
        System.out.println(-1);


    }


}


