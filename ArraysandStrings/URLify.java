package ArraysandStrings;

public class URLify {

    public static String approachone(String str, int len){
        char[] ch = str.toCharArray();
        String result = "";
        for(int i=0;i<ch.length;i++){
            if(ch[i]==' ' && i<len){
                result+="%20";
            }
            else if(ch[i]!=' '){
                result+=ch[i];
            }

        }
        return result;

    }

    public static char[] approachtwo(String str, int len){
        char[] str_arr = str.toCharArray();
        int space_count=0;
        for(int i=0;i<len;i++){
            if(str_arr[i]==' '){
                space_count+=1;
            }
        }
        int index = len+space_count*2;
        if(len<str_arr.length){str_arr[len] =  '\0';}
        for(int i=len-1;i>=0;i--){
            if(str_arr[i]==' '){
                str_arr[index-1] = '0';
                str_arr[index-2] = '2';
                str_arr[index-3] = '%';
                index = index-3;

            }
            else{
                str_arr[index-1] = str_arr[i];
                index--;
            }
        }
        str = str_arr.toString();
        System.out.println(str);
        return str_arr;

    }

    public static void main(String[] args){

        System.out.println(approachtwo("Mr John Smith    ",13));

    }
}
