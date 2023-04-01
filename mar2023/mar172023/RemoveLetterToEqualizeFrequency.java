package mar2023.mar172023;

import java.util.*;

class RemoveLetterToEqualizeFrequency {
    public boolean equalFrequency(String word) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : word.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        Set<Integer> freqSet = new HashSet<>(freq.values());

        if (freqSet.size() > 2) {
            return false;
        }

        if (freqSet.size() == 1) {
            return true;
        }

        int maxFreq = Collections.max(freq.values());
        int minFreq = Collections.min(freq.values());
        int maxFreqCount = 0;
        int minFreqCount = 0;

        for (int f : freq.values()) {
            if (f == maxFreq) {
                maxFreqCount++;
            } else if (f == minFreq) {
                minFreqCount++;
            } else {
                return false;
            }
        }

        if (maxFreq - minFreq == 1) {
            return maxFreqCount == 1 || minFreqCount == 1;
        }

        if (minFreq == 1 && minFreqCount == 1) {
            return true;
        }

        return false;
    }
}
