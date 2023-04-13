package apr2023.apr132023;

public class ValidateStackSequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int[] stack = new int[pushed.length];
        int top = -1;
        int i = 0;
        for (int j = 0; j < popped.length; j++) {
            if (top >= 0 && stack[top] == popped[j]) {
                top--;
            } else {
                while (i < pushed.length && pushed[i] != popped[j]) {
                    stack[++top] = pushed[i++];
                }
                if (i == pushed.length) {
                    return false;
                }
                i++;
            }
        }
        return true;

    }
}
