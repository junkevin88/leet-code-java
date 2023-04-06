package apr2023.apr062023;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {
    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        dfs(s.toCharArray(), 0, result);
        return result;
    }

    private void dfs(char[] s, int index, List<String> result) {
        if (index == s.length) {
            result.add(new String(s));
            return;
        }

        if (Character.isLetter(s[index])) {
            s[index] = Character.toLowerCase(s[index]);
            dfs(s, index + 1, result);
            s[index] = Character.toUpperCase(s[index]);
        }

        dfs(s, index + 1, result);
    }
}
