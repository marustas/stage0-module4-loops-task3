package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        int sum = 0;
        if (t >= 0) {
            while (t != 0) {
                int digit;
                digit = t % 10;
                sum = sum + digit;
                t = t / 10;
            }
            System.out.println(sum);
        } else if (t < 0) {
            while (t != 0) {
                int digit;
                digit = t % 10;
                sum = sum + digit;
                t = t / 10;
            }
            System.out.println(-1 * sum);
        }

    }
}
