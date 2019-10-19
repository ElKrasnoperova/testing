package mathTest;

import math.BaseTrigonometrical;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

@Category(Tests.class)
public class BaseTrigonometricalTest {
    private BaseTrigonometrical sinBase = new BaseTrigonometrical();
    private double precision = 0.01;
    private double delta = 0.01;

    @Test
    public void sin_negativeNumbers() {
        double x = -18;
        double sin = sinBase.sin(x, precision);
        assertEquals(Math.sin(x), sin, delta);
    }

    @Test
    public void sin_positiveNumber() {
        double x = 18;
        double sin = sinBase.sin(x, precision);
        assertEquals(Math.sin(x), sin, delta);
    }

    @Test
    public void sin_zero() {
        double sin = sinBase.sin(0, precision);
        assertEquals(0, sin, delta);
    }

    @Test
    public void sin_standardValues() {
        double[] standardValues = {Math.PI, -Math.PI, Math.PI/2, -Math.PI/2, Math.PI/4, -Math.PI/4, 3*Math.PI/4, -3*Math.PI/4};
        for (double x : standardValues) {
            double sin = sinBase.sin(x, precision);
            assertEquals(Math.sin(x), sin, delta);
        }
    }
}
