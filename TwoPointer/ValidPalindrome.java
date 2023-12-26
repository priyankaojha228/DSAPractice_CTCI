package TwoPointer;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        if(s.equals(" ")){return true;}
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++){
            int val = s.charAt(i);
            if(Character.isLetterOrDigit(s.charAt(i))){
                if(Character.isUpperCase(s.charAt(i))){
                    char ch = Character.toLowerCase(s.charAt(i));
                    str.append(ch);
                }
                else{str.append(s.charAt(i));}
            }
        }
        System.out.println(str);
        int j=str.length()-1;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            j--;

        }
        return true;

    }
    public static void main(String[] args){
        System.out.println(isPalindrome("A Man, a plan, a canal: Panama"));
    }
}
