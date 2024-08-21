package Handlers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SubtractHandlerTest {

    private final SubtractHandler subtractHandler = new SubtractHandler();

    @Test
    public void testSubtractIntegers_positive() throws Exception {
        assertEquals(4, subtractHandler.executeOperation(7, 3));
    }

    @Test
    public void testSubtractIntegers_negative() throws Exception {
        assertEquals(-10, subtractHandler.executeOperation(-7, 3));
    }

    @Test
    public void testSubtractIntegers_underflow() throws Exception {
        assertThrows(ArithmeticException.class, () -> subtractHandler.executeOperation(Integer.MIN_VALUE, 1));
    }

    @Test
    public void testSubtractLongs() throws Exception {
        assertEquals(0L, subtractHandler.executeOperation(5000000000L, 5000000000L));
    }

    @Test
    public void testSubtractLongs_underflow() throws Exception {
        assertThrows(ArithmeticException.class, () -> subtractHandler.executeOperation(Long.MIN_VALUE, 1L));
    }

    @Test
    public void testSubtractLongAndInt() throws Exception {
        assertEquals(5000000000L, subtractHandler.executeOperation(5000000001L, 1));
    }


    @Test
    public void testSubtractDoubles_positive() throws Exception {
        assertEquals(3.9, (Double) subtractHandler.executeOperation(7.2, 3.3), 0.000001);
    }

    @Test
    public void testSubtractDoubles_negative() throws Exception {
        assertEquals(-10.5, (Double) subtractHandler.executeOperation(-7.0, 3.5), 0.000001);
    }

    @Test
    public void testSubtractDoubles_underflow() throws Exception {
        assertThrows(ArithmeticException.class, () -> subtractHandler.executeOperation(-Double.MAX_VALUE, Double.MAX_VALUE));
    }

    @Test
    public void testSubtractFloats_positive() throws Exception {
        assertEquals(3.9F, (float) subtractHandler.executeOperation(7.2f, 3.3f), 0.000001f);
    }

    @Test
    public void testSubtractFloats_negative() throws Exception {
        assertEquals(-10.5F, (float) subtractHandler.executeOperation(-7.0f, 3.5f), 0.000001f);
    }

    @Test
    public void testSubtractFloats_underflow() throws Exception {
        assertThrows(ArithmeticException.class, () -> subtractHandler.executeOperation(-Float.MAX_VALUE, Float.MAX_VALUE));
    }

    @Test
    public void testSubtractLongAndDouble() throws Exception {
        assertEquals(1.0, subtractHandler.executeOperation(2L , 1.0));
    }
}
