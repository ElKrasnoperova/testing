package math;

public class LogarithmeticalExpression {
    private LogarithmicalFunctions func = new LogarithmicalFunctions();

    double calculate(double x, double precision) {
        return ((Math.pow(func.log3(x, precision), 3) * func.log3(x, precision)) *
                func.ln(x, precision)) * (func.log3(x, precision) * Math.pow(func.log2(x, precision), 2)) +
                (func.log5(x, precision) + func.log5(x, precision)) * func.ln(x, precision) / func.log10(x, precision);
    }
}
