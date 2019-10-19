package mathTest.stubs;

import math.LogarithmeticalExpression;
import math.TrigonometricExpression;

public class EquationSystemStub {
    LogarithmeticalExpression logarithmeticalExpression = new LogarithmeticalExpressionStub();
    TrigonometricExpression trigonometricExpression = new TrigonometricExpressionStub();

    public double calculate(double x, double precision) {
        return x > 0 ? logarithmeticalExpression.calculate(x, precision) : trigonometricExpression.calculate(x, precision);
    }
}
