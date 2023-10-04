package ArraysandStrings;

public class ZeroMatrix {

    public static void nullifyRow(int[][] mat, int row){
        for(int j=0;j<mat[0].length;j++){
            mat[row][j]=0;
        }
    }
    public static void nullifyColumn(int[][] mat, int col){
        for(int i=0;i<mat.length;i++){
            mat[i][col]=0;
        }
    }
    public static void setzero(int[][] mat){
        boolean[] row = new boolean[mat.length];
        boolean[] column = new boolean[mat[0].length];
        for(int i=0;i< mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    row[i]=true;
                    column[j]=true;
                }
            }
        }
        for(int i=0;i<row.length;i++){
            if(row[i]){
                nullifyRow(mat,i);
            }
        }
        for(int i=0;i<column.length;i++){
            if(column[i]){
                nullifyColumn(mat,i);
            }
        }

    }
    public static void main(String[] args){
        int[][] matrix = {{1,2,0},{4,5,6},{7,8,9}};
        setzero(matrix);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.println(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
