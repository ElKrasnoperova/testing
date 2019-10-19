package mathTest.stubs;

import math.ILogarithmicalFunctions;
import math.LogarithmicalFunctions;

public class LogarithmicalFunctionsStub extends LogarithmicalFunctions {
    @Override
    public double ln(double x, double precision) {
        return Math.log(x);
    }

    @Override
    public double log2(double x, double precision) {
        return Math.log(x) / Math.log(2);
    }

    @Override
    public double log3(double x, double precision) {
        return Math.log(x) / Math.log(3);
    }

    @Override
    public double log5(double x, double precision) {
        return Math.log(x) / Math.log(5);
    }

    @Override
    public double log10(double x, double precision) {
        return Math.log10(x);
    }
}
