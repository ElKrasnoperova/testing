package mathTest;

import math.*;
import mathTest.stubs.*;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

@Category(Tests.class)
public class EquationSystemTest {
    private EquationsSystem sys = new EquationsSystem();
    private EquationsSystem sysExprFullStub = new EquationsSystem(new LogarithmeticalExpressionStub(), new TrigonometricExpressionStub());
    private EquationsSystem sysExprTrigStub = new EquationsSystem(new TrigonometricExpression(new TrigonometricFunctions(new BaseTrigonometricalStub())));
    private EquationsSystem sysExprLogStub = new EquationsSystem(new LogarithmeticalExpression(new LogarithmicalFunctions(new BaseLogarithmicalStub())));
    private double precision = 0.000000001;
    private double delta = 0.01;

    @Test
    public void calculatePermissibleValues() {
        double[] permissibleVariables = {-Math.PI / 4, -Math.PI / 6, 0.6, 100};

        for (double var : permissibleVariables) {
            double result = sys.calculate(var, precision);
            double rightResult = new EquationSystemStub().calculate(var, precision);
            assertEquals(rightResult, result, delta);
        }
    }

    @Test
    public void calculateInvalidValues() {
        double[] invalidVariables = {0, -Math.PI / 2, 1};
        for (double var : invalidVariables) {
            double result = sys.calculate(var, precision);
            assertEquals(Double.NaN, result, delta);
        }
    }

    @Test
    public void calculatePermissibleValuesFullStub() {
        double[] permissibleVariables = {-Math.PI / 4, -Math.PI / 6, 0.6, 100};

        for (double var : permissibleVariables) {
            double result = sysExprFullStub.calculate(var, precision);
            double rightResult = new EquationSystemStub().calculate(var, precision);
            assertEquals(rightResult, result, delta);
        }
    }

    @Test
    public void calculateInvalidValuesFullStub() {
        double[] invalidVariables = {0, -Math.PI / 2, 1};
        for (double var : invalidVariables) {
            double result = sysExprFullStub.calculate(var, precision);
            assertEquals(Double.NaN, result, delta);
        }
    }

    @Test
    public void calculatePermissibleValuesTrigStub() {
        double[] permissibleVariables = {-Math.PI / 4, -Math.PI / 6, 0.6, 100};

        for (double var : permissibleVariables) {
            double result = sysExprTrigStub.calculate(var, precision);
            double rightResult = new EquationSystemStub().calculate(var, precision);
            assertEquals(rightResult, result, delta);
        }
    }

    @Test
    public void calculateInvalidValuesTrigStub() {
        double[] invalidVariables = {0, -Math.PI / 2, 1};
        for (double var : invalidVariables) {
            double result = sysExprTrigStub.calculate(var, precision);
            assertEquals(Double.NaN, result, delta);
        }
    }

    @Test
    public void calculatePermissibleValuesLogStub() {
        double[] permissibleVariables = {-Math.PI / 4, -Math.PI / 6, 0.6, 100};

        for (double var : permissibleVariables) {
            double result = sysExprLogStub.calculate(var, precision);
            double rightResult = new EquationSystemStub().calculate(var, precision);
            assertEquals(rightResult, result, delta);
        }
    }

    @Test
    public void calculateInvalidValuesLogStub() {
        double[] invalidVariables = {0, -Math.PI / 2, 1};
        for (double var : invalidVariables) {
            double result = sysExprLogStub.calculate(var, precision);
            assertEquals(Double.NaN, result, delta);
        }
    }
}
