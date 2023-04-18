package apr2023.apr182023;

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder c = new StringBuilder();
        int i = 0;
        int j = 0;
        while (i < word1.length() && j < word2.length()) {
            c.append(word1.charAt(i));
            c.append(word2.charAt(j));
            i++;
            j++;
        }
        while (i < word1.length()) {
            c.append(word1.charAt(i));
            i++;
        }
        while (j < word2.length()) {
            c.append(word2.charAt(j));
            j++;
        }
        return c.toString();

    }
}
