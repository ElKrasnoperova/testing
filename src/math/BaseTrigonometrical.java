package math;

public class BaseTrigonometrical implements IBaseTrigonometrical {


    @Override
    public double sin(double x, double precision) {
        x = fixX(x);
        double previousResult = 1.0;
        double result = 0;


        for (int n = 1; Math.abs(Math.abs(result) - Math.abs(previousResult)) > precision; n++) {
            previousResult = result;
            result += Math.pow(-1, n - 1) * Math.pow(x, 2 * n - 1) / factorial(2 * n - 1);
        }
        return Math.abs(result) > Double.POSITIVE_INFINITY ? Double.POSITIVE_INFINITY : result;
    }

    private static double factorial(int x) {
        double result = 1;
        for (int i = 2; i <= x; i++) {
            result *= i;
        }
        return result;
    }

    private double fixX(double x) {
        double delta = Math.PI * 2;
        if (x < 0) delta *= -1;
        while (Math.abs(x) > 30.0) {
            x -= delta;
        }
        return x;
    }

    public static void main(String[] args) {
        BaseTrigonometrical lg = new BaseTrigonometrical();
        System.out.println(lg.sin(-2, 0.001));
    }
}
