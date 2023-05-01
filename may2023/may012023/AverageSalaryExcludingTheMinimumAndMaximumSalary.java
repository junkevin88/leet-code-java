package may2023.may012023;

public class AverageSalaryExcludingTheMinimumAndMaximumSalary {
    public double average(int[] salary) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int len = salary.length;

        for (int i = 0; i < len; i++) {
            sum += salary[i];
            if (salary[i] < min) {
                min = salary[i];
            }
            if (salary[i] > max) {
                max = salary[i];
            }
        }

        return (double) (sum - min - max) / (len - 2);

    }
}
