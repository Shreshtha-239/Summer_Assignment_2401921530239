package week_one.day_four;

import java.util.LinkedList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> l = new LinkedList<>();
        int te = matrix.length*matrix[0].length;
        int c = 0;
        int minr = 0;
        int minc = 0;
        int maxr = matrix.length;
        int maxc = matrix[0].length;
        while(c < te) {
            for(int i = minc;i < maxc && c < te;i++) {
                l.add(matrix[minr][i]);
                c++;
            }
            minr++;
            for(int i = minr;i < maxr && c < te;i++) {
                l.add(matrix[i][maxc-1]);
                c++;
            }
            maxc--;
            for(int i = maxc-1;i >= minc && c < te;i--) {
                l.add(matrix[maxr-1][i]);
                c++;
            }
            maxr--;
            for(int i = maxr-1;i >= minr && c < te;i--) {
                l.add(matrix[i][minc]);
                c++;
            }
            minc++;
        }
        return l;
    }
}