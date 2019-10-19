package math;

public class EquationsSystem extends AbstractMath {
    LogarithmeticalExpression logarithmeticalExpression;
    TrigonometricExpression trigonometricExpression;

    public EquationsSystem() {
        this.logarithmeticalExpression = new LogarithmeticalExpression();
        this.trigonometricExpression = new TrigonometricExpression();
    }

    public EquationsSystem(LogarithmeticalExpression logarithmeticalExpression) {
        this.logarithmeticalExpression = logarithmeticalExpression;
        this.trigonometricExpression = new TrigonometricExpression();
    }

    public EquationsSystem(TrigonometricExpression trigonometricExpression) {
        this.logarithmeticalExpression = new LogarithmeticalExpression();
        this.trigonometricExpression = trigonometricExpression;
    }

    public EquationsSystem(LogarithmeticalExpression logarithmeticalExpression, TrigonometricExpression trigonometricExpression) {
        this.logarithmeticalExpression = logarithmeticalExpression;
        this.trigonometricExpression = trigonometricExpression;
    }

    public double calculate(double x, double precision) {
        return x > 0 ? logarithmeticalExpression.calculate(x, precision) : trigonometricExpression.calculate(x, precision);
    }
}
