package jun2023.jun192023;

public class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {

        int max = 0;
        int curr = 0;

        for (int i = 0; i < gain.length; i++) {
            curr += gain[i];
            max = Math.max(max, curr);
        }

        return max;
    }
}
