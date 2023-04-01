package mar2023.mar122023;

class MaxDifferenceYouCanGetFromChangingAnInteger {
    public int maxDiff(int num) {


        /*
        Given an integer num. You will apply the following steps exactly two times:
        Pick a digit x (0 <= x <= 9).
        Pick another digit y (0 <= y <= 9). The digit y can be equal to x.
        Replace all the occurrences of x in the decimal representation of num by y.
        The new integer cannot have any leading zeros, also the new integer cannot be 0.
        Let a and b be the results of applying the operations to num the first and second times, respectively.
        Return the max difference between a and b.
        Example 1:
        Input: num = 555
        Output: 888
        Explanation: The first time pick x = 5 and y = 9 and store the new integer in a.
        The second time pick x = 5 and y = 1 and store the new integer in b.
        We have now a = 999 and b = 111 and max difference = 888
        Example 2:
        Input: num = 9
        Output: 8
        Explanation: The first time pick x = 9 and y = 9 and store the new integer in a.
        The second time pick x = 9 and y = 1 and store the new integer in b.
        We have now a = 9 and b = 1 and max difference = 8
        Example 3:
        Input: num = 123456
        Output: 820000
        Example 4:
        Input: num = 10000
        Output: 80000
        Example 5:
        Input: num = 9288
        Output: 8700
        Constraints:
        1 <= num <= 10^8
         */

//        answer:

        String s = Integer.toString(num);
        int n = s.length();

        // Find the largest digit that is not 9
        char maxChar = '9';
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != '9') {
                maxChar = s.charAt(i);
                break;
            }
        }

        // Replace all occurrences of maxChar with '9' to get the maximum possible value
        String a = s.replaceAll(Character.toString(maxChar), "9");
        int A = Integer.parseInt(a);

        // If the first digit is not 1, replace all occurrences of the first digit with '1' to get the minimum possible value
        // Otherwise, find the smallest digit that is not 0 or 1 and replace all occurrences of that digit with '0'
        String b = "";
        if (s.charAt(0) != '1') {
            b = s.replaceAll(Character.toString(s.charAt(0)), "1");
        } else {
            char minChar = '0';
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) > '0' && s.charAt(i) != '1') {
                    minChar = s.charAt(i);
                    break;
                }
            }
            b = s.replaceAll(Character.toString(minChar), "0");
        }
        int B = Integer.parseInt(b);

        return A - B;
    }

}
