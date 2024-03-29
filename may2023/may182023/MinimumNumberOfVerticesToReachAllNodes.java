package may2023.may182023;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


class MinimumNumberOfVerticesToReachAllNodes {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        Set<Integer> destinations = new HashSet<>();

        for (List<Integer> edge : edges) {
            destinations.add(edge.get(1));
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (!destinations.contains(i)) {
                result.add(i);
            }
        }

        return result;
    }
}
