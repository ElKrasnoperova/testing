package mathTest.stubs;

import math.TrigonometricExpression;

import java.util.ArrayList;
import java.util.Arrays;

public class TrigonometricExpressionStub extends TrigonometricExpression {
    private TrigonometricFunctionsStub func = new TrigonometricFunctionsStub();
    private ArrayList<Double> invalidVariables = new ArrayList<Double>(Arrays.asList(0.0, Math.PI, Math.PI / 2, -Math.PI / 2));

    @Override
    public double calculate(double x, double precision) {
        if (x % (Math.PI / 2) == 0) {
            return Double.NaN;
        }
        return (((Math.pow(func.cot(x, precision) + func.cos(x, precision), 2)) +
                func.csc(x, precision) * func.cot(x, precision)) +
                (func.tan(x, precision) - func.sin(x, precision))) -
                func.tan(x, precision) * (func.sec(x, precision) / func.cos(x, precision) -
                        (func.sin(x, precision) + (func.sec(x, precision) - func.cot(x, precision))));
    }
}
