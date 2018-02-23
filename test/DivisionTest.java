import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DivisionTest {

    Division division;

    @Before
    public void setup() {
        division = new Division();
    }

    @Test (expected = ArithmeticException.class)
    public void testDivideByZero() {
        division.divideByZero(5);
    }

}