package ArraysandStrings;

public class StringCompression {
    
    public static String approachone(String str){
        int count=0;
        StringBuilder str2 = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if((i+1)>=str.length()||(str.charAt(i)!=str.charAt(i+1))) {
                count++;
                str2.append(str.charAt(i));
                str2.append(count);
                count = 0;
            }
            else{
                count++;
            }
        }
        return str2.length()<str.length()?str2.toString():str;


    }
    public static void main(String[] args){


        System.out.println(approachone("aabbbccccccddd"));

    }
}
