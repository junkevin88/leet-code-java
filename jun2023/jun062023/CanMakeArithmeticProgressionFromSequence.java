package jun2023.jun062023;

public class CanMakeArithmeticProgressionFromSequence {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int n = arr.length;
        if (n == 2) {
            return true;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        int diff = (max - min) / (n - 1);
        if (diff == 0) {
            return true;
        }

        boolean[] visited = new boolean[n];
        for (int num : arr) {
            int index = (num - min) / diff;
            if (visited[index]) {
                return false;
            }
            visited[index] = true;
        }

        return true;

    }
}
