package math;

public class BaseLogarithmical extends AbstractMath implements IBaseLogarithmical {
    private static final double LN10 = 2.302585092994045684017991454684364207601101488628772976033;

    @Override
    public double ln(double x, double precision) {
        if (Double.isNaN(x) || x < 0) return Double.NaN;
        if (x == 0) return Double.NEGATIVE_INFINITY;
        if (x == Double.POSITIVE_INFINITY) return Double.POSITIVE_INFINITY;

        double result = 0.0;

        if (x > 1) {
            while (x > 1) {
                result += LN10;
                x = x / 10;
            }
        }

        double tmp_result = 1;
        for (double n = 1.0; Math.abs(tmp_result) > precision; n++) {
            tmp_result = Math.pow((-1), (n + 1)) * Math.pow((x - 1.0), n) / n;
            result += tmp_result;
        }
        return result;
    }

    public static void main(String[] args) {
        double x = 11;
        double precision = 0.01;

        BaseLogarithmical baseLogarithmical = new BaseLogarithmical();
        baseLogarithmical.printToCSV(x, baseLogarithmical.ln(x, precision), "ln");
    }
}

