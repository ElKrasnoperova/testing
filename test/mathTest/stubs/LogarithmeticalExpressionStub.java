package mathTest.stubs;

import math.LogarithmeticalExpression;

public class LogarithmeticalExpressionStub extends LogarithmeticalExpression {
    private LogarithmicalFunctionsStub func = new LogarithmicalFunctionsStub();

    @Override
    public double calculate(double x, double precision) {
        if (x == 1 || x < 0) {
            return Double.NaN;
        }
        return ((Math.pow(func.log3(x, precision), 3) * func.log3(x, precision)) *
                func.ln(x, precision)) * (func.log3(x, precision) * Math.pow(func.log2(x, precision), 2)) +
                (func.log5(x, precision) + func.log5(x, precision)) * func.ln(x, precision) / func.log10(x, precision);
    }
}
