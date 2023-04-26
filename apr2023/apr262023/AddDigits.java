package apr2023.apr262023;

public class AddDigits {
    public int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        int res = num % 9;
        return res == 0 ? 9 : res;

    }
}
