package mathTest.stubs;

import math.EquationsSystem;
import math.LogarithmeticalExpression;
import math.TrigonometricExpression;

public class EquationSystemStub extends EquationsSystem {
    LogarithmeticalExpression logarithmeticalExpression = new LogarithmeticalExpressionStub();
    TrigonometricExpression trigonometricExpression = new TrigonometricExpressionStub();

    @Override
    public double calculate(double x, double precision) {
        return x > 0 ? logarithmeticalExpression.calculate(x, precision) : trigonometricExpression.calculate(x, precision);
    }
}
