package mar302023;

public class ReverseString {
    public void reverseString(char[] s) {
        int n = s.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }


    }
}
