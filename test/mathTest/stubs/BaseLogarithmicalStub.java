package mathTest.stubs;

import math.BaseLogarithmical;

public class BaseLogarithmicalStub extends BaseLogarithmical {
    @Override
    public double ln(double x, double precision) {
        return Math.log(x);
    }
}
