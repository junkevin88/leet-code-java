package jun2023.jun082023;

public class CountNegativeNumbersInASortedMatrix {
    public int countNegatives(int[][] grid) {
        int count = 0;
        int row = grid.length;
        int col = grid[0].length;
        int i = 0;
        int j = col - 1;
        while (i < row && j >= 0) {
            if (grid[i][j] < 0) {
                count += row - i;
                j--;
            } else {
                i++;
            }
        }
        return count;
    }

    }
