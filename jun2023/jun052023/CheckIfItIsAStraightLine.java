package jun2023.jun052023;

public class CheckIfItIsAStraightLine {
        public boolean checkStraightLine(int[][] coordinates) {
            int n = coordinates.length;
            if (n == 2) {
                return true;
            }

            int x0 = coordinates[0][0];
            int y0 = coordinates[0][1];
            int x1 = coordinates[1][0];
            int y1 = coordinates[1][1];

            for (int i = 2; i < n; i++) {
                int x = coordinates[i][0];
                int y = coordinates[i][1];

                if ((y1 - y0) * (x - x0) != (y - y0) * (x1 - x0)) {
                    return false;
                }
            }

            return true;

        }
}
