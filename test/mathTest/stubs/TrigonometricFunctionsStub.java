package mathTest.stubs;

import math.BaseTrigonometrical;
import math.TrigonometricFunctions;

import static java.lang.Double.NaN;

public class TrigonometricFunctionsStub extends TrigonometricFunctions {
    @Override
    public double sin(double x, double precision) {
        return new BaseTrigonometrical().sin(x, precision);
    }

    @Override
    public double cos(double x, double precision) {
        if ((x % (Math.PI/2) == 0) && (x % Math.PI != 0)) {
            return 0;
        }
        return Math.cos(x);
    }

    @Override
    public double tan(double x, double precision) {
        return cos(x, 0) == (double) 0 ? NaN : Math.tan(x);
    }

    @Override
    public double cot(double x, double precision) {
        double tan = Math.tan(x);
        return (sin(x, 0) == (double) 0) ? NaN : 1 / tan;
    }

    @Override
    public double sec(double x, double precision) {
        double cos = cos(x, 0);
        return (cos == (double) 0) ? NaN : 1 / cos;
    }

    @Override
    public double csc(double x, double precision) {
        double sin = sin(x, 0);
        return (sin == (double) 0) ? NaN : 1 / sin;
    }
}
