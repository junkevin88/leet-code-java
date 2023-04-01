package mar2023.mar262023;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public int strStr(String haystack, String needle) {

        if (needle.length() == 0) {
            return 0;
        }

        if (haystack.length() == 0) {
            return -1;
        }

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < haystack.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                if (j == needle.length() - 1) {
                    return k;
                }
                i++;
                j++;
            } else {
                k++;
                i = k;
                j = 0;
            }
        }

        return -1;
    }
}
