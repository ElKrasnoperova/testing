package math;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class BaseLogarithmicalTest {

    private BaseLogarithmical lnBase = new BaseLogarithmical();

    @Test
    public void ln_negativeNumbers() {
        double ln = lnBase.ln(-3, 0.001);
        Assert.assertEquals(Double.NaN, ln, 0.001);
    }

    @Test
    public void ln_zero() {
        double ln = lnBase.ln(0, 0.001);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, ln, 0.001);
    }

    @Test
    public void ln_one() {
        double ln = lnBase.ln(1, 0.001);
        Assert.assertEquals(0, ln, 0.1);
    }

    @Test
    public void ln_positiveInfinity() {
        double ln = lnBase.ln(Double.POSITIVE_INFINITY, 0.001);
        Assert.assertEquals(Double.POSITIVE_INFINITY, ln, 0.001);
    }

    @Test
    public void ln_lessThanOneMoreThanZero() {
        double ln = lnBase.ln(0.5, 0.001);
        Assert.assertEquals(-0.693, ln, 0.001);
    }

    @Test
    public void ln_moreThanOne() {
        double ln = lnBase.ln(1000, 0.001);
        Assert.assertEquals(6.908, ln, 0.001);
    }

    @Test
    public void ln_forDifferentBases() {
        List<Integer> toCalculate = Arrays.asList(2, 3, 5, 10);
        List<Double> requiredList = Arrays.asList(0.693, 1.099, 1.609, 2.303);
        for (int i = 0; i < toCalculate.size(); ++i) {
            double ln = lnBase.ln(toCalculate.get(i), 0.0001);
            Assert.assertEquals(requiredList.get(i), ln, 0.001);
        }
    }

}