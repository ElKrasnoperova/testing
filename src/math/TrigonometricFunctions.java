package math;

import static java.lang.Double.NaN;

public class TrigonometricFunctions extends AbstractMath implements ITrigonomerticFunctions {
    private BaseTrigonometrical sinBase;

    public TrigonometricFunctions(BaseTrigonometrical sinBase) {
        this.sinBase = sinBase;
    }

    public TrigonometricFunctions() {
        this.sinBase = new BaseTrigonometrical();
    }

    @Override
    public double sin(double x, double precision) {
        return sinBase.sin(x, precision);
    }

    @Override
    public double cos(double x, double precision) {
        double sin = sinBase.sin(x, precision);
        double result = Math.sqrt(1 - Math.pow(sin, 2));
        result = Double.isNaN(result) ? 0 : result;
        boolean isNegative = Math.ceil((Math.abs(x) / (Math.PI / 2))) % 4 == 2;
        if (isNegative) result *= -1;
        return result;
    }

    @Override
    public double tan(double x, double precision) {
        double cot = cot(x, precision);
        return (cot == 0) ? NaN : 1 / cot;
    }

    @Override
    public double cot(double x, double precision) {
        double sin = sinBase.sin(x, precision);
        return (sin == 0) ? NaN : cos(x, precision) / sin;
    }

    @Override
    public double sec(double x, double precision) {
        double cos = cos(x, precision);
        return (cos == 0) ? NaN : 1 / cos;
    }

    @Override
    public double csc(double x, double precision) {
        double sin = sinBase.sin(x, precision);
        return (sin == 0) ? NaN : 1 / sin;
    }
}

