package mathTest;

import math.BaseLogarithmical;
import math.LogarithmeticalExpression;
import math.LogarithmicalFunctions;
import mathTest.stubs.LogarithmeticalExpressionStub;
import mathTest.stubs.LogarithmicalFunctionsStub;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@Category(Tests.class)
public class LogarithmeticalExpressionTest {
    private LogarithmeticalExpression expr = new LogarithmeticalExpression();
    private LogarithmeticalExpression exprStub = new LogarithmeticalExpression(new LogarithmicalFunctions(new BaseLogarithmical()));
    private LogarithmeticalExpression exprFullStub = new LogarithmeticalExpression(new LogarithmicalFunctionsStub());

    @Test
    public void calculate_one() {
        double value = expr.calculate(1, 0.001);
        assertEquals(Double.NaN, value, 0.01);
    }

    @Test
    public void calculate_lessThanOne() {
        List<Double> toCalculate = Arrays.asList(0.6, 0.2, 0.1, 0.01, 0.05, 0.09);
        for (int i = 0; i < toCalculate.size(); ++i) {
            double value = expr.calculate(toCalculate.get(i), 0.000000001);
            assertEquals(new LogarithmeticalExpressionStub().calculate(toCalculate.get(i), 0), value, 0.1);
        }
    }

    @Test
    public void calculate_oneStub() {
        double value = exprStub.calculate(1, 0.001);
        assertEquals(Double.NaN, value, 0.01);
    }

    @Test
    public void calculate_lessThanOneStub() {
        List<Double> toCalculate = Arrays.asList(0.6, 0.2, 0.1, 0.01, 0.05, 0.09);
        for (int i = 0; i < toCalculate.size(); ++i) {
            double value = exprStub.calculate(toCalculate.get(i), 0.000000001);
            assertEquals(new LogarithmeticalExpressionStub().calculate(toCalculate.get(i), 0), value, 0.1);
        }
    }

    @Test
    public void calculate_oneFullStub() {
        double value = exprFullStub.calculate(1, 0.001);
        assertEquals(Double.NaN, value, 0.01);
    }

    @Test
    public void calculate_lessThanOneFullStub() {
        List<Double> toCalculate = Arrays.asList(0.6, 0.2, 0.1, 0.01, 0.05, 0.09);
        for (int i = 0; i < toCalculate.size(); ++i) {
            double value = exprFullStub.calculate(toCalculate.get(i), 0.000001);
            assertEquals(new LogarithmeticalExpressionStub().calculate(toCalculate.get(i), 0), value, 0.1);
        }
    }
}