import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertThrows;
import static org.testng.Assert.expectThrows;
import static org.testng.AssertJUnit.assertTrue;

public class Test_Factorial_testng {
    private Factorial trigger;

    @BeforeTest
    public void init() {
        trigger = new Factorial();
    }

    @Test
    public void factorial() {
        assertTrue(trigger.factorial(0) == 1);
        assertTrue(trigger.factorial(1) == 1);
        assertTrue(trigger.factorial(5) == 120);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void factorialNegative() {
        trigger.factorial(-1);
    }
}



