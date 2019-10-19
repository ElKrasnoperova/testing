package mathTest;

import math.TrigonometricFunctions;
import mathTest.stubs.BaseTrigonometricalStub;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

@Category(Tests.class)
public class TrigonometricFunctionsTest extends BaseTrigonometricalTest {
    private TrigonometricFunctions func = new TrigonometricFunctions();
    private TrigonometricFunctions funcWithStub = new TrigonometricFunctions(new BaseTrigonometricalStub());
    private double precision = 0.001;
    private double delta = 0.001;

    @Test
    public void sin() {
        double[] standardValues = {-Math.PI / 4, Math.PI / 4, Math.PI / 6, -Math.PI / 6};
        for (double x : standardValues) {
            double sin = func.sin(x, precision);
            assertEquals(Math.sin(x), sin, delta);
        }
    }

    @Test
    public void cos() {
        double[] standardValues = {-Math.PI / 4, Math.PI / 4, Math.PI / 6, -Math.PI / 6};
        for (double x : standardValues) {
            double cos = func.cos(x, precision);
            assertEquals(Math.cos(x), cos, delta);
        }
    }

    @Test
    public void tan() {
        double[] permissibleVariables = {-Math.PI / 4, Math.PI / 4, Math.PI / 6, -Math.PI / 6};
        double[] invalidVariables = {-Math.PI / 2, Math.PI / 2};

        for (double var : permissibleVariables) {
            double javaTan = Math.tan(var);
            double tan = func.tan(var, precision);
            assertEquals(javaTan, tan, delta);
        }
        for (double var : invalidVariables) {
            double javaTan = Math.tan(var);
            assertNotEquals(javaTan, func.tan(var, precision), delta);
        }
    }

    @Test
    public void cot() {
        double[] permissibleVariables = {-Math.PI / 4, Math.PI / 4, Math.PI / 6, -Math.PI / 6};
        double[] invalidVariables = {0, Math.PI};

        for (double var : permissibleVariables) {
            double javaCot = Math.cos(var) / Math.sin(var);
            double cot = func.cot(var, precision);
            assertEquals(javaCot, cot, delta);
        }
        for (double var : invalidVariables) {
            double javaCot = Math.cos(var) / Math.sin(var);
            double cot = func.cot(var, precision);
            assertNotEquals(javaCot, cot, delta);
        }
    }

    @Test
    public void sec() {
        double[] permissibleVariables = {-Math.PI / 4, Math.PI / 4, Math.PI / 6, -Math.PI / 6};
        double[] invalidVariables = {-Math.PI / 2, Math.PI / 2};

        for (double var : permissibleVariables) {
            double javaSec = 1 / Math.cos(var);
            double sec = func.sec(var, precision);
            assertEquals(javaSec, sec, delta);
        }
        for (double var : invalidVariables) {
            double javaSec = 1 / Math.cos(var);
            double sec = func.sec(var, precision);
            assertNotEquals(javaSec, sec, delta);
        }
    }

    @Test
    public void csc() {
        double[] permissibleVariables = {3 * Math.PI / 4, Math.PI / 4, Math.PI / 3, 2 * Math.PI / 3};
        double[] invalidVariables = {0, Math.PI};

        for (double var : permissibleVariables) {
            double javaCsc = 1 / Math.sin(var);
            double csc = func.csc(var, precision);
            assertEquals(javaCsc, csc, delta);
        }
        for (double var : invalidVariables) {
            double javaCsc = 1 / Math.sin(var);
            double csc = func.csc(var, precision);
            assertNotEquals(javaCsc, csc, delta);
        }
    }
    @Test
    public void sinStub() {
        double[] standardValues = {-Math.PI / 4, Math.PI / 4, Math.PI / 6, -Math.PI / 6};
        for (double x : standardValues) {
            double sin = funcWithStub.sin(x, precision);
            assertEquals(Math.sin(x), sin, delta);
        }
    }

    @Test
    public void cosStub() {
        double[] standardValues = {-Math.PI / 4, Math.PI / 4, Math.PI / 6, -Math.PI / 6};
        for (double x : standardValues) {
            double cos = funcWithStub.cos(x, precision);
            assertEquals(Math.cos(x), cos, delta);
        }
    }

    @Test
    public void tanStub() {
        double[] permissibleVariables = {-Math.PI / 4, Math.PI / 4, Math.PI / 6, -Math.PI / 6};
        double[] invalidVariables = {-Math.PI / 2, Math.PI / 2};

        for (double var : permissibleVariables) {
            double javaTan = Math.tan(var);
            double tan = funcWithStub.tan(var, precision);
            assertEquals(javaTan, tan, delta);
        }
        for (double var : invalidVariables) {
            double javaTan = Math.tan(var);
            assertNotEquals(javaTan, funcWithStub.tan(var, precision), delta);
        }
    }

    @Test
    public void cotStub() {
        double[] permissibleVariables = {-Math.PI / 4, Math.PI / 4, Math.PI / 6, -Math.PI / 6};
        double[] invalidVariables = {0, Math.PI};

        for (double var : permissibleVariables) {
            double javaCot = Math.cos(var) / Math.sin(var);
            double cot = funcWithStub.cot(var, precision);
            assertEquals(javaCot, cot, delta);
        }
        for (double var : invalidVariables) {
            double javaCot = Math.cos(var) / Math.sin(var);
            double cot = funcWithStub.cot(var, precision);
            assertNotEquals(javaCot, cot, delta);
        }
    }

    @Test
    public void secStub() {
        double[] permissibleVariables = {-Math.PI / 4, Math.PI / 4, Math.PI / 6, -Math.PI / 6};
        double[] invalidVariables = {-Math.PI / 2, Math.PI / 2};

        for (double var : permissibleVariables) {
            double javaSec = 1 / Math.cos(var);
            double sec = funcWithStub.sec(var, precision);
            assertEquals(javaSec, sec, delta);
        }
        for (double var : invalidVariables) {
            double javaSec = 1 / Math.cos(var);
            double sec = funcWithStub.sec(var, precision);
            assertNotEquals(javaSec, sec, delta);
        }
    }

    @Test
    public void cscStub() {
        double[] permissibleVariables = {3 * Math.PI / 4, Math.PI / 4, Math.PI / 3, 2 * Math.PI / 3};
        double[] invalidVariables = {0, Math.PI};

        for (double var : permissibleVariables) {
            double javaCsc = 1 / Math.sin(var);
            double csc = funcWithStub.csc(var, precision);
            assertEquals(javaCsc, csc, delta);
        }
        for (double var : invalidVariables) {
            double javaCsc = 1 / Math.sin(var);
            double csc = funcWithStub.csc(var, precision);
            assertNotEquals(javaCsc, csc, delta);
        }
    }
}
