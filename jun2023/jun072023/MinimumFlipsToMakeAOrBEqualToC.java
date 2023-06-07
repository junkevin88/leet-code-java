package jun2023.jun072023;

public class MinimumFlipsToMakeAOrBEqualToC {
    public int minFlips(int a, int b, int c) {
        int flips = 0;
        while (a > 0 || b > 0 || c > 0) {
            int aBit = a & 1;
            int bBit = b & 1;
            int cBit = c & 1;
            if (cBit == 0) {
                if (aBit == 1 && bBit == 1) {
                    flips += 2;
                } else if (aBit == 1 || bBit == 1) {
                    flips += 1;
                }
            } else {
                if (aBit == 0 && bBit == 0) {
                    flips += 1;
                }
            }
            a = a >> 1;
            b = b >> 1;
            c = c >> 1;
        }
        return flips;

    }
}
