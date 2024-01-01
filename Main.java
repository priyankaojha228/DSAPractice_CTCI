import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[][] isConnected = {{1,1,0},{1,1,0},{0,0,1}};
        String str = "";
        int count=0;
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected[0].length;j++){
                String str_i = Integer.toString(i);
                String str_j = Integer.toString(j);
                if(isConnected[i][j]==1 && !str.contains(str_i)){
                    count+=1;
                    str+=str_i;
                }
                if(isConnected[i][j]==1 && !str.contains(str_j)){
                    count+=1;
                    str+=str_j;
                }
            }
        }
        System.out.println(count);


    }


}


