package math;

public class LogarithmicalFunctions implements ILogarithmicalFunctions {

    private BaseLogarithmical baseLn = new BaseLogarithmical();
    @Override
    public double ln(double x, double precision) {
        return baseLn.ln(x, precision);
    }

    @Override
    public double log2(double x, double precision) {
        return baseLn.ln(x, precision) / baseLn.ln(2, precision);
    }

    @Override
    public double log3(double x, double precision) {
        return baseLn.ln(x, precision) / baseLn.ln(3, precision);
    }

    @Override
    public double log5(double x, double precision) {
        return baseLn.ln(x, precision) / baseLn.ln(5, precision);

    }

    @Override
    public double log10(double x, double precision) {
        return baseLn.ln(x, precision) / baseLn.ln(10, precision);
    }

}
