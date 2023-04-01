package mar2023.mar302023;

public class ReverseWordsInAStringIII {
    public String reverseWords(String s) {

        StringBuffer sbf = new StringBuffer();
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') { //i =5 - i=10 - i=19
                for (int j = i - 1; j >= k; j--) {
                    sbf.append(s.charAt(j)); //"s'teL" - "s'teL ekat" - "s'teL ekat edoCteeL"
                }
                sbf.append(" "); //"s'teL " - "s'teL ekat " - "s'teL ekat edoCteeL "
                k = i + 1; //k=6 -
            }
        }
        int len = s.length() - 1;
        while (len >= 0 && s.charAt(len) != ' ') {
            sbf.append(s.charAt(len));
            len--;
        }
        String singleString = sbf.toString();
        return singleString;

    }
}
