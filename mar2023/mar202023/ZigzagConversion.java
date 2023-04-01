package mar2023.mar202023;

class ZigzagConversion {
    public String convert(String s, int numRows) {

        if (numRows == 1) {
            return s;
        }

        int len = s.length();
        int cycleLen = 2 * numRows - 2;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < len; j += cycleLen) {
                sb.append(s.charAt(j + i));
                if (i != 0 && i != numRows - 1 && j + cycleLen - i < len) {
                    sb.append(s.charAt(j + cycleLen - i));
                }
            }
        }
        return sb.toString();
    }
}