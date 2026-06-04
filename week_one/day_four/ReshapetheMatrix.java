package week_one.day_four;

public class ReshapetheMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int noe = mat.length*mat[0].length;
        int nc = r*c;
        if(noe == nc) {
            int[][] nmat = new int[r][c];
            int n = 0;
            for(int i = 0;i < r;i++) {
                for(int j = 0;j < c;j++) {
                    nmat[i][j] = mat[n/mat[0].length][n%mat[0].length];
                    n++;
                }
            }
            return nmat;
        }
        return mat;
    }
}