package apr2023.apr032023;

public class BoatsToSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        int[] frequency = new int[limit + 1];
        for (int person : people) {
            frequency[person]++;
        }
        int boats = 0;
        int i = 1;
        int j = limit;
        while (i <= j) {
            while (i <= j && frequency[i] == 0) {
                i++;
            }
            while (i <= j && frequency[j] == 0) {
                j--;
            }
            if (i <= j) {
                boats++;
                frequency[i]--;
                if (i + j <= limit) {
                    frequency[j]--;
                }
            }
        }
        return boats;
    }

}
