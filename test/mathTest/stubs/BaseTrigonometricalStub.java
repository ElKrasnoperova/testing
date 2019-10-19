package mathTest.stubs;

import math.BaseTrigonometrical;

public class BaseTrigonometricalStub extends BaseTrigonometrical {
    @Override
    public double sin(double x, double precision) {
        return x % Math.PI == 0 ? 0 : Math.sin(x);
    }
}
