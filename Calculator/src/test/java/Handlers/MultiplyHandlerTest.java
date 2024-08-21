package Handlers;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MultiplyHandlerTest {

    private final MultiplyHandler multiplyHandler = new MultiplyHandler();

    @Test
    public void testMultiplyIntegers_positive() throws Exception {
        assertEquals(21, multiplyHandler.executeOperation(7, 3));
    }

    @Test
    public void testMultiplyIntegers_negative() throws Exception {
        assertEquals(-21, multiplyHandler.executeOperation(-7, 3));
    }

    @Test
    public void testMultiplyIntegers_overflow() throws Exception {
        assertThrows(ArithmeticException.class, () -> multiplyHandler.executeOperation(Integer.MAX_VALUE, 2));
    }

    @Test
    public void testMultiplyLongs() throws Exception {
        assertEquals(25000000000L, multiplyHandler.executeOperation(5000000000L, 5L));
    }

    @Test
    public void testMultiplyLongs_overflow() throws Exception {
        assertThrows(ArithmeticException.class, () -> multiplyHandler.executeOperation(Long.MAX_VALUE, 2L));
    }

    @Test
    public void testMultiplyLongAndInt() throws Exception {
        assertEquals(5000000000L, multiplyHandler.executeOperation(2500000000L, 2));
    }

    @Test
    public void testMultiplyDoubles_positive() throws Exception {
        assertEquals(23.76, (Double) multiplyHandler.executeOperation(7.2, 3.3), 0.000001);
    }

    @Test
    public void testMultiplyDoubles_negative() throws Exception {
        assertEquals(-23.76, (Double) multiplyHandler.executeOperation(-7.2, 3.3), 0.000001);
    }

    @Test
    public void testMultiplyDoubles_overflow() throws Exception {
        assertThrows(ArithmeticException.class, () -> multiplyHandler.executeOperation(Double.MAX_VALUE, Double.MAX_VALUE));
    }

    @Test
    public void testMultiplyFloats_positive() throws Exception {
        assertEquals(23.04F, (float) multiplyHandler.executeOperation(7.2f, 3.2f), 0.0001f);
    }

    @Test
    public void testMultiplyFloats_negative() throws Exception {
        assertEquals(-23.04F, (float) multiplyHandler.executeOperation(-7.2f, 3.2f), 0.0001f);
    }

    @Test
    public void testMultiplyFloats_overflow() throws Exception {
        assertThrows(ArithmeticException.class, () -> multiplyHandler.executeOperation(Float.MAX_VALUE, Float.MAX_VALUE));
    }

    @Test
    public void testMultiplyLongAndDouble() throws Exception {
        assertEquals(10.0, multiplyHandler.executeOperation(2L , 5.0));
    }
}
