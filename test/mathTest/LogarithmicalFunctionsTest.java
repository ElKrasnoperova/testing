package mathTest;

import math.LogarithmicalFunctions;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@Category(IntegrationTests.class)
public class LogarithmicalFunctionsTest {
    private LogarithmicalFunctions func = new LogarithmicalFunctions();

    @Test
    public void log2_moreThanOne() {
        List<Integer> toCalculate = Arrays.asList(2, 8, 32, 128, 512, 2048);
        List<Double> requiredList = Arrays.asList(1.0, 3.0, 5.0, 7.0, 9.0, 11.0);
        int iter = 0;
        for (Integer integer : toCalculate) {
            double ln = func.log2(integer, 0.0001);
            assertEquals(requiredList.get(iter), ln, 0.01);
            iter++;
        }
    }

    @Test
    public void log2_lessThanOne() {
        List<Double> toCalculate = Arrays.asList(0.8, 0.4, 0.2, 0.05, 0.25, 0.02);
        List<Double> requiredList = Arrays.asList(-0.322, -1.322, -2.322, -4.322, -2.0, -5.644);
        int iter = 0;
        for (Double d : toCalculate) {
            double ln = func.log2(d, 0.0001);
            assertEquals(requiredList.get(iter), ln, 0.01);
            iter++;
        }
    }

    @Test
    public void log3_moreThanOne() {
        List<Double> toCalculate = Arrays.asList(3.0, 27.0, 81.0, 100.0, 250.0, 1000.0);
        List<Double> requiredList = Arrays.asList(1.0, 3.0, 4.0, 4.192, 5.026, 6.288);
        int iter = 0;
        for (Double d : toCalculate) {
            double ln = func.log3(d, 0.0001);
            assertEquals(requiredList.get(iter), ln, 0.01);
            iter++;
        }
    }

    @Test
    public void log3_lessThanOne() {
        List<Double> toCalculate = Arrays.asList(0.6, 0.2, 0.1, 0.01, 0.05, 0.09);
        List<Double> requiredList = Arrays.asList(-0.465, -1.465, -2.096, -4.192, -2.727, -2.192);
        int iter = 0;
        for (Double d : toCalculate) {
            double ln = func.log3(d, 0.0001);
            assertEquals(requiredList.get(iter), ln, 0.01);
            iter++;
        }
    }

    @Test
    public void log5_lessThanOne() {
        List<Double> toCalculate = Arrays.asList(0.6, 0.2, 0.1, 0.01, 0.05, 0.09);
        List<Double> requiredList = Arrays.asList(-0.317, -1.0, -1.431, -2.861, -1.861, -1.496);
        int iter = 0;
        for (Double d : toCalculate) {
            double ln = func.log5(d, 0.0001);
            assertEquals(requiredList.get(iter), ln, 0.01);
            iter++;
        }
    }

    @Test
    public void log5_moreThanOne() {
        List<Double> toCalculate = Arrays.asList(5.0, 25.0, 125.0, 100.0, 250.0, 1000.0);
        List<Double> requiredList = Arrays.asList(1.0, 2.0, 3.0, 2.861, 3.431, 4.292);
        int iter = 0;
        for (Double d : toCalculate) {
            double ln = func.log5(d, 0.0001);
            assertEquals(requiredList.get(iter), ln, 0.01);
            iter++;
        }
    }

    @Test
    public void log10_lessThanOne() {
        List<Double> toCalculate = Arrays.asList(0.6, 0.2, 0.1, 0.01, 0.05, 0.09);
        List<Double> requiredList = Arrays.asList(-0.222, -0.699, -1.0, -2.0, -1.301, -1.046);
        int iter = 0;
        for (Double d : toCalculate) {
            double ln = func.log10(d, 0.0001);
            assertEquals(requiredList.get(iter), ln, 0.01);
            iter++;
        }
    }

    @Test
    public void log10_moreThanOne() {
        List<Double> toCalculate = Arrays.asList(10.0, 25.0, 125.0, 100.0, 250.0, 1000.0);
        List<Double> requiredList = Arrays.asList(1.0, 1.398, 2.097, 2.0, 2.398, 3.0);
        int iter = 0;
        for (Double d : toCalculate) {
            double ln = func.log10(d, 0.0001);
            assertEquals(requiredList.get(iter), ln, 0.01);
            iter++;
        }
    }


}