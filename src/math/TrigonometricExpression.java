package math;

public class TrigonometricExpression extends AbstractMath {
    private TrigonometricFunctions func = new TrigonometricFunctions();

    public double calculate(double x, double precision) {
        return (((func.cot(x, precision) + Math.pow(func.cos(x, precision), 2)) +
                func.csc(x, precision) * func.cot(x, precision)) +
                (func.tan(x, precision) - func.sin(x, precision))) -
                func.tan(x, precision) * (func.sec(x, precision) / func.cos(x, precision) -
                        (func.sin(x, precision) + (func.sec(x, precision) - func.cot(x, precision))));
    }
}
