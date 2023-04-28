package apr2023.apr282023;

public class SimilarStringGroups {
    private int find(int[] parent, int i) {
        if (parent[i] == -1) {
            return i;
        }
        return parent[i] = find(parent, parent[i]);
    }

    private boolean isSimilar(String s1, String s2) {
        int n = s1.length();
        int diff = 0;
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diff++;
                if (diff > 2) {
                    return false;
                }
            }
        }
        return true;
    }

    public int numSimilarGroups(String[] strs) {
        int n = strs.length;
        int[] parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = -1;
        }
        int res = n;
        for (int i = 0; i < n; i++) {
            int p1 = find(parent, i);
            for (int j = i + 1; j < n; j++) {
                int p2 = find(parent, j);
                if (p1 == p2) {
                    continue;
                }
                if (isSimilar(strs[i], strs[j])) {
                    parent[p2] = p1;
                    res--;
                }
            }
        }
        return res;


    }
}
