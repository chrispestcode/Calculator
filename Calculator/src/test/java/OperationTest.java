import static org.junit.jupiter.api.Assertions.*;

import Calculator.Operation;
import org.junit.jupiter.api.Test;

class OperationTest {

    @Test
    void testGetAddSymbol() {
        assertEquals("+", Operation.ADD.getSymbol());
    }

    @Test
    void testGetSubtractSymbol() {
        assertEquals("-", Operation.SUBTRACT.getSymbol());
    }

    @Test
    void testGetMultiplySymbol() {
        assertEquals("*", Operation.MULTIPLY.getSymbol());
    }

    @Test
    void testGetDivideSymbol() {
        assertEquals("/", Operation.DIVIDE.getSymbol());
    }

    @Test
    void testAddFromSymbol() {
        assertEquals(Operation.ADD, Operation.fromSymbol("+"));
    }


    @Test
    void testSubtractFromSymbol() {
        assertEquals(Operation.SUBTRACT, Operation.fromSymbol("-"));
    }


    @Test
    void testMultiplyFromSymbol() {
        assertEquals(Operation.MULTIPLY, Operation.fromSymbol("*"));
    }

    @Test
    void testDivideFromSymbol() {
        assertEquals(Operation.DIVIDE, Operation.fromSymbol("/"));
    }

    @Test
    void testFromSymbolUnsupportedOperation() {
        assertThrows(UnsupportedOperationException.class, () -> {
            Operation.fromSymbol("%");
        });
    }
}
