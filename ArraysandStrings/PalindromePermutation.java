package ArraysandStrings;

public class PalindromePermutation {

    public static boolean approachone(String str){
        str = str.toLowerCase();
        int[] arr = new int[128];
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            System.out.println((int)ch);
            if(ch!=32){
            arr[ch]+=1;}
        }

        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                count+=1;
            }
        }
        if(count>1){
            return false;
        }
        return true;
    }


    public static void main(String[] args){


        System.out.println(approachone("tact coa"));

    }
}
