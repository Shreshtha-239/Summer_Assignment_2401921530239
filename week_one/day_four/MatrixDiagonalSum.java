package week_one.day_four;

public class MatrixDiagonalSum {
      public int diagonalSum(int[][] mat) {
        int ds = 0;
        for(int i = 0;i < mat.length;i++) {
            if(i != mat.length-1-i) {
                ds += (mat[i][i]+mat[i][mat.length-1-i]);
            } else {
                ds += mat[i][i];
            }
        }
        return ds;
    }
}