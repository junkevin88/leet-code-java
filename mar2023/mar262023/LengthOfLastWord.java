package mar2023.mar262023;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {

        if (s.length() == 0) {
            return 0;
        }

        int i = s.length() - 1;
        int count = 0;

        while (i >= 0) {
            if (s.charAt(i) == ' ') {
                if (count == 0) {
                    i--;
                } else {
                    return count;
                }
            } else {
                count++;
                i--;
            }
        }

        return count;
    }
}
