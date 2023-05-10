package may2023.may102023;

public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {

            int[][] res = new int[n][n];
            int num = 1;
            int rowStart = 0;
            int rowEnd = n - 1;
            int colStart = 0;
            int colEnd = n - 1;

            while (rowStart <= rowEnd && colStart <= colEnd) {

                for (int i = colStart; i <= colEnd; i++) {
                    res[rowStart][i] = num++;
                }
                rowStart++;

                for (int i = rowStart; i <= rowEnd; i++) {
                    res[i][colEnd] = num++;
                }
                colEnd--;

                for (int i = colEnd; i >= colStart; i--) {
                    res[rowEnd][i] = num++;
                }
                rowEnd--;

                for (int i = rowEnd; i >= rowStart; i--) {
                    res[i][colStart] = num++;
                }
                colStart++;
            }

            return res;

    }
}
