package jun2023.jun092023;

public class FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (letters[mid] == target) {
                break;
            } else if (letters[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        if (letters[mid] <= target) {
            mid++;
        }
        if (mid == letters.length) {
            mid = 0;
        }
        return letters[mid];
    }
}
