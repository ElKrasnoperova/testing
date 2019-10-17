package mathTest;

import math.LogarithmeticalExpression;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@Category(IntegrationTests.class)
public class LogarithmeticalExpressionTest {
    private LogarithmeticalExpression expr = new LogarithmeticalExpression();

    @Test
    public void calculate_one() {
        double value = expr.calculate(1, 0.001);
        assertEquals(Double.NaN, value, 0.01);
    }

    @Test
    public void calculate_lessThanOne() {
        List<Double> toCalculate = Arrays.asList(0.6, 0.2, 0.1, 0.01, 0.05, 0.09);
        List<Double> requiredList = Arrays.asList(-1.456, 53.944, 1021.08, 263070.0, 8427.7, 1463.05);
        for (int i = 0; i < toCalculate.size(); ++i) {
            double value = expr.calculate(toCalculate.get(i), 0.000001);
            assertEquals(requiredList.get(i), value, 0.1);
        }
    }
}