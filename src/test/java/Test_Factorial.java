import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test_Factorial {

    private Factorial trigger;

    @BeforeEach
    public void init() {
        trigger = new Factorial();
    }

    @Test
    public void factorial() {
        assertTrue(trigger.factorial(0) == 1);
        assertTrue(trigger.factorial(1) == 1);
        assertTrue(trigger.factorial(5) == 120);
    }

    @Test
    void exceptionTesting() {
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> trigger.factorial(-1),
                "Expected doThing() to throw, but it didn't"
        );
    }
}

