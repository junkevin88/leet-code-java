package may2023.may052023;

public class MaximumNumberOfVowelsInASubstringOfGivenLength {
    public int maxVowels(String s, int k) {

        int res = 0;
        int len = s.length();
        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i'
                    || c == 'o' || c == 'u') {
                arr[i] = 1;
            }
        }

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        res = sum;

        for (int i = k; i < len; i++) {
            sum += arr[i] - arr[i - k];
            res = Math.max(res, sum);
        }

        return res;
    }
}
