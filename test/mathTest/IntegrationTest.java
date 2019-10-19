package mathTest;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(Tests.class)
@Suite.SuiteClasses({BaseLogarithmicalTest.class, BaseTrigonometricalTest.class, TrigonometricFunctionsTest.class,
        LogarithmicalFunctionsTest.class, LogarithmeticalExpressionTest.class, TrigonometricExpressionTest.class, EquationSystemTest.class})
public class IntegrationTest {
}
