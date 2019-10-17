package mathTest;

import math.BaseLogarithmical;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(Categories.class)
@Categories.IncludeCategory(IntegrationTests.class)
@Suite.SuiteClasses( { BaseLogarithmicalTest.class, LogarithmeticalExpressionTest.class, LogarithmicalFunctionsTest.class })
public class IntegrationTest {

}
