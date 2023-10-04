package ArraysandStrings;

public class RotateMatrix {

    public static boolean rotatemat(int[][] mat){
        if(mat.length==0 || mat.length!=mat[0].length){
            return false;
        }
        for(int layer=0; layer<mat.length/2; layer++){
            int first = layer;
            int last = mat.length-1-layer;
            for(int i=first; i<last;i++){
                int offset = i-first;
                int top = mat[first][i];
                mat[first][i]=mat[last-offset][first];
                mat[last-offset][first] = mat[last][last-offset];
                mat[last][last-offset]=mat[i][last];
                mat[i][last]=top;
            }

        }
        return true;
    }
    public static void main(String[] args){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(rotatemat(matrix));

    }
}
