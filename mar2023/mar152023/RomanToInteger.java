package mar2023.mar152023;

class RomanToInteger {
    public int romanToInt(String s) {

//        I = 1
//        V = 5
//        X = 10
//        L = 50
//        C = 100
//        D = 500

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'I') {
                sum += 1;
            } else if (c == 'V') {
                sum += 5;
            } else if (c == 'X') {
                sum += 10;
            } else if (c == 'L') {
                sum += 50;
            } else if (c == 'C') {
                sum += 100;
            } else if (c == 'D') {
                sum += 500;
            } else if (c == 'M') {
                sum += 1000;
            }
        }

        if (s.contains("IV")) {
            sum -= 2;
        }
        if (s.contains("IX")) {
            sum -= 2;
        }
        if (s.contains("XL")) {
            sum -= 20;
        }
        if (s.contains("XC")) {
            sum -= 20;
        }
        if (s.contains("CD")) {
            sum -= 200;
        }
        if (s.contains("CM")) {
            sum -= 200;
        }

        return sum;

    }
}
