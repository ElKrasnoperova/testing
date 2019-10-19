package mathTest;

import math.TrigonometricExpression;
import math.TrigonometricFunctions;
import mathTest.stubs.BaseTrigonometricalStub;
import mathTest.stubs.TrigonometricExpressionStub;
import mathTest.stubs.TrigonometricFunctionsStub;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrigonometricExpressionTest {
    private TrigonometricExpression expr = new TrigonometricExpression();
    private TrigonometricExpression exprFullStub = new TrigonometricExpression(new TrigonometricFunctionsStub());
    private TrigonometricExpression exprStub = new TrigonometricExpression(new TrigonometricFunctions(new BaseTrigonometricalStub()));
    private double precision = 0.0001;
    private double delta = 0.01;

    @Test
    public void calculatePermissibleValues() {
        double[] permissibleVariables = {-Math.PI / 4, Math.PI / 4, Math.PI / 6, -Math.PI / 6};

        for (double var : permissibleVariables) {
            double result = expr.calculate(var, precision);
            double rightResult = new TrigonometricExpressionStub().calculate(var, precision);
            assertEquals(rightResult, result, delta);
        }
    }

    @Test
    public void calculateInvalidValues() {
        double[] invalidVariables = {0, Math.PI, Math.PI / 2, -Math.PI / 2};
        for (double var : invalidVariables) {
            double result = expr.calculate(var, precision);
            assertEquals(Double.NaN, result, delta);
        }
    }

    @Test
    public void calculatePermissibleValuesStub() {
        double[] permissibleVariables = {-Math.PI / 4, Math.PI / 4, Math.PI / 6, -Math.PI / 6};

        for (double var : permissibleVariables) {
            double result = exprStub.calculate(var, precision);
            double rightResult = new TrigonometricExpressionStub().calculate(var, precision);
            assertEquals(rightResult, result, delta);
        }
    }

    @Test
    public void calculateInvalidValuesStub() {
        double[] invalidVariables = {0, Math.PI, Math.PI / 2, -Math.PI / 2};
        for (double var : invalidVariables) {
            double result = exprStub.calculate(var, precision);
            assertEquals(Double.NaN, result, delta);
        }
    }

    @Test
    public void calculatePermissibleValuesFullStub() {
        double[] permissibleVariables = {-Math.PI / 4, Math.PI / 4, Math.PI / 6, -Math.PI / 6};

        for (double var : permissibleVariables) {
            double result = exprFullStub.calculate(var, precision);
            double rightResult = new TrigonometricExpressionStub().calculate(var, precision);
            assertEquals(rightResult, result, delta);
        }
    }

    @Test
    public void calculateInvalidValuesFullStub() {
        double[] invalidVariables = {0, Math.PI, Math.PI / 2, -Math.PI / 2};
        for (double var : invalidVariables) {
            double result = exprFullStub.calculate(var, precision);
            assertEquals(Double.NaN, result, delta);
        }
    }
}
