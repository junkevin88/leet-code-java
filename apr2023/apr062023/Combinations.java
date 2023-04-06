package apr2023.apr062023;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
//Given two integers n and k, return all possible combinations of k numbers chosen from the range [1, n].
//
//You may return the answer in any order.

        Set<List<Integer>> set = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(i);
            set.add(list);
        }
        for (int i = 2; i <= k; i++) {
            Set<List<Integer>> temp = new HashSet<>();
            for (List<Integer> list : set) {
                int last = list.get(list.size() - 1);
                for (int j = last + 1; j <= n; j++) {
                    List<Integer> newList = new ArrayList<>(list);
                    newList.add(j);
                    temp.add(newList);
                }
            }
            set = temp;
        }
        return new ArrayList<>(set);





    }
}
