package mathTest;

import math.BaseLogarithmical;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.junit.After;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@Category(Tests.class)
public class BaseLogarithmicalTest {
    private BaseLogarithmical lnBase = new BaseLogarithmical();
    private double precision = 0.001;
    private double delta = 0.001;

    @Test
    public void ln_negativeNumbers() {
        double ln = lnBase.ln(-3, precision);
        assertEquals(Double.NaN, ln, delta);
    }

    @Test
    public void ln_zero() {
        double ln = lnBase.ln(0, precision);
        assertEquals(Double.NEGATIVE_INFINITY, ln, delta);
    }

    @Test
    public void ln_one() {
        double ln = lnBase.ln(1, precision);
        delta = 0.1;
        assertEquals(0, ln, delta);
    }

    @Test
    public void ln_positiveInfinity() {
        double ln = lnBase.ln(Double.POSITIVE_INFINITY, precision);
        assertEquals(Double.POSITIVE_INFINITY, ln, delta);
    }

    @Test
    public void ln_lessThanOneMoreThanZero() {
        double ln = lnBase.ln(0.5, precision);
        assertEquals(-0.693, ln, delta);
    }

    @Test
    public void ln_moreThanOne() {
        double ln = lnBase.ln(1000, precision);
        assertEquals(6.908, ln, delta);
    }

    @Test
    public void ln_forDifferentBases() {
        List<Integer> toCalculate = Arrays.asList(2, 3, 5, 10);
        List<Double> requiredList = Arrays.asList(0.693, 1.099, 1.609, 2.303);
        precision = 0.0001;

        for (int i = 0; i < toCalculate.size(); ++i) {
            double ln = lnBase.ln(toCalculate.get(i), precision);
            assertEquals(requiredList.get(i), ln, delta);
        }
    }
}