package Handlers;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DivideHandlerTest {

    private final DivideHandler divideHandler = new DivideHandler();

    @Test
    public void testDivideIntegers_positive() throws Exception {
        assertEquals(2, divideHandler.executeOperation(6, 3));
    }

    @Test
    public void testDivideIntegers_negative() throws Exception {
        assertEquals(-2, divideHandler.executeOperation(-6, 3));
    }

    @Test
    public void testDivideIntegers_divideByZero() throws Exception {
        assertThrows(ArithmeticException.class, () -> divideHandler.executeOperation(6, 0));
    }

    @Test
    public void testDivideLongs() throws Exception {
        assertEquals(2L, divideHandler.executeOperation(6L, 3L));
    }

    @Test
    public void testDivideLongs_divideByZero() throws Exception {
        assertThrows(ArithmeticException.class, () -> divideHandler.executeOperation(6L, 0L));
    }

    @Test
    public void testDivideLongAndInt() throws Exception {
        assertEquals(2500000000L, divideHandler.executeOperation(5000000000L, 2));
    }

    @Test
    public void testDivideDoubles_positive() throws Exception {
        assertEquals(2.4, (Double) divideHandler.executeOperation(7.2, 3.0), 0.000001);
    }

    @Test
    public void testDivideDoubles_negative() throws Exception {
        assertEquals(-2.4, (Double) divideHandler.executeOperation(-7.2, 3.0), 0.000001);
    }

    @Test
    public void testDivideDoubles_divideByZero() throws Exception {
        assertThrows(ArithmeticException.class, () -> divideHandler.executeOperation(7.2, 0.0));
    }

    @Test
    public void testDivideDoubles_infinityCheck() throws Exception {
        assertThrows(ArithmeticException.class, () -> divideHandler.executeOperation(Double.MAX_VALUE, Double.MIN_VALUE));
    }

    @Test
    public void testDivideFloats_positive() throws Exception {
        assertEquals(2.4F, (float) divideHandler.executeOperation(7.2f, 3.0f), 0.000001f);
    }

    @Test
    public void testDivideFloats_negative() throws Exception {
        assertEquals(-2.4F, (float) divideHandler.executeOperation(-7.2f, 3.0f), 0.000001f);
    }

    @Test
    public void testDivideFloats_divideByZero() throws Exception {
        assertThrows(ArithmeticException.class, () -> divideHandler.executeOperation(7.2f, 0.0f));
    }

    @Test
    public void testDivideFloats_infinityCheck() throws Exception {
        assertThrows(ArithmeticException.class, () -> divideHandler.executeOperation(Float.MAX_VALUE, Float.MIN_VALUE));
    }

    @Test
    public void testDivideLongAndDouble() throws Exception {
        assertEquals(2.0, divideHandler.executeOperation(5L , 2.5));
    }
}
