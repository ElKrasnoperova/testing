package math;

public class TrigonometricFunctions implements ITrigonomerticFunctions {

    private BaseTrigonometrical sinBase = new BaseTrigonometrical();
    @Override
    public double sin(double x, double precision) {
        return sinBase.sin(x, precision);
    }

    @Override
    public double cos(double x, double precision) {
        double result = Math.sqrt(1 - Math.pow(sinBase.sin(x, precision), 2));
        if (x > Math.PI / 2 && x < 3 * Math.PI / 2) result *= -1;
        return result;
    }

    @Override
    public double tan(double x, double precision) {
        double cot = cot(x, precision);
        return (cot == 0) ? Double.NaN : 1 / cot;
    }

    @Override
    public double cot(double x, double precision) {
        double sin = sinBase.sin(x, precision);
        return (sin == 0) ? Double.NaN : cos(x, precision) / sin;
    }

    @Override
    public double sec(double x, double precision) {
        double cos = cos(x, precision);
        return (cos == 0) ? Double.NaN : 1 / cos;
    }

    @Override
    public double csc(double x, double precision) {
        double sin = sinBase.sin(x, precision);
        return (sin == 0) ? Double.NaN : 1 / sin;
    }

    public static void main(String[] args) {
        TrigonometricFunctions tf = new TrigonometricFunctions();
        System.out.println(tf.csc(0, 0.001));
    }
}

