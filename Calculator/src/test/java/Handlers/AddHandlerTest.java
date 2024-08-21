package Handlers;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AddHandlerTest {

    private final AddHandler addHandler = new AddHandler();

    @Test
    public void testAddIntegers_positive() throws Exception {
        assertEquals(10, addHandler.executeOperation(7, 3));
    }


    @Test
    public void testAddIntegers_negative() throws Exception {
        assertEquals(-4, addHandler.executeOperation(-7, 3));
    }

    @Test
    public void testAddIntegers_overflow() throws Exception {
        assertThrows(ArithmeticException.class, () -> addHandler.executeOperation(Integer.MAX_VALUE, 1));
    }

    @Test
    public void testAddLongs() throws Exception {
        assertEquals(10000000000L, addHandler.executeOperation(5000000000L, 5000000000L));
    }

    @Test
    public void testAddLongs_overflow() throws Exception {
        assertThrows(ArithmeticException.class, () -> addHandler.executeOperation(Long.MAX_VALUE, 1L));
    }

    @Test
    public void testAddDoubles_positive() throws Exception {
        assertEquals(10.5F, (Double) addHandler.executeOperation(7.2, 3.3), 0.000001);
    }

    @Test
    public void testAddDoubles_negative() throws Exception {
        assertEquals(-3.5, (Double) addHandler.executeOperation(-7.0, 3.5), 0.000001);
    }

    @Test
    public void testAddDoubles_overflow() throws Exception {
        assertThrows(ArithmeticException.class, () -> addHandler.executeOperation(Double.MAX_VALUE, Double.MAX_VALUE));
    }

    @Test
    public void testAddFloats_positive() throws Exception {
        // Test simple addition
        assertEquals(10.5F, (float) addHandler.executeOperation(7.2f, 3.3f), 0.000001f);
    }

    @Test
    public void testAddFloats_negative() throws Exception {
        assertEquals(-3.5F,(float) addHandler.executeOperation(-7.0f, 3.5f), 0.000001f);
    }

    @Test
    public void testAddFloats_overflow() throws Exception {
        assertThrows(ArithmeticException.class, () -> addHandler.executeOperation(Float.MAX_VALUE, Float.MAX_VALUE));
    }
}
