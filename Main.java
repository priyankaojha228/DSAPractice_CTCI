import java.util.*;
public class Main {
    public static void main(String[] args) {

        int[] a = {25,2,3,57,38,41};
        ArrayList<Integer> solution = new ArrayList<>();
        int[] arr = new int[10];
        Arrays.fill(arr,0);
        for(int i=0;i<a.length;i++){
            if (a[i]<10){
                arr[a[i]]+=1;
            }
            else if (a[i]>=10){
                int num = a[i];
                while(num>0){
                    int d = num%10;
                    System.out.println(d);
                    arr[d]+=1;
                    num=num/10;
                }
            }
        }
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                solution.add(i);
            }
        }

        System.out.println(solution);
    }



          //  public static void main(String[] args) {
//                String binaryString = "100110";
//                String s = binaryString;
//        int n = s.length();
//
//        // Initialize two counters for flipping 0s to 1s and 1s to 0s
//        int flipToZeroCount = 0;
//        int flipToOneCount = 0;
//
//        int minFlips = Integer.MAX_VALUE;
//
//        for (int i = 0; i < n; i++) {
//            char currentChar = s.charAt(i);
//
//            // Count flips needed to make the left substring all 0s (flip to 0)
//            if (i % 2 == 0) {
//                if (currentChar == '1') {
//                    flipToZeroCount++;
//                }
//            }
//            // Count flips needed to make the left substring all 1s (flip to 1)
//            else {
//                if (currentChar == '0') {
//                    flipToOneCount++;
//                }
//            }
//
//            // Count flips needed to make the right substring all 0s (flip to 1)
//            if ((i + 1) % 2 == 0) {
//                minFlips = Math.min(minFlips, flipToZeroCount + flipToOneCount);
//            }
//            // Count flips needed to make the right substring all 1s (flip to 0)
//            else {
//                minFlips = Math.min(minFlips, flipToZeroCount + flipToOneCount);
//            }
//        }
//
//        System.out.println("Minimum flips required: " + minFlips);
            }


