import Calculator.Operation;
import Calculator.OperationExecutor;
import Handlers.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationExecutorTest {

    private OperationExecutor operationExecutor;

    @BeforeEach
    void setUp() {
        operationExecutor = new OperationExecutor();
    }

    @Test
    void testGetOperationHandlerForAdd() {
        OperationHandler handler = operationExecutor.getOperationHandler(Operation.ADD);
        assertNotNull(handler);
        assertTrue(handler instanceof AddHandler);
    }

    @Test
    void testGetOperationHandlerForSubtract() {
        OperationHandler handler = operationExecutor.getOperationHandler(Operation.SUBTRACT);
        assertNotNull(handler);
        assertTrue(handler instanceof SubtractHandler);
    }

    @Test
    void testGetOperationHandlerForMultiply() {
        OperationHandler handler = operationExecutor.getOperationHandler(Operation.MULTIPLY);
        assertNotNull(handler);
        assertTrue(handler instanceof MultiplyHandler);
    }

    @Test
    void testGetOperationHandlerForDivide() {
        OperationHandler handler = operationExecutor.getOperationHandler(Operation.DIVIDE);
        assertNotNull(handler);
        assertTrue(handler instanceof DivideHandler);
    }

    @Test
    void testGetOperationHandlerForUnsupportedOperation() {
        UnsupportedOperationException exception = assertThrows(UnsupportedOperationException.class, () ->
                operationExecutor.getOperationHandler(null)
        );

        assertTrue(exception.getMessage().contains("The provided arithmetic Calculator.Operation is unsupported."));
    }

    @Test
    void testFromSymbolForSupportedOperations() {
        assertEquals(Operation.ADD, Operation.fromSymbol("+"));
        assertEquals(Operation.SUBTRACT, Operation.fromSymbol("-"));
        assertEquals(Operation.MULTIPLY, Operation.fromSymbol("*"));
        assertEquals(Operation.DIVIDE, Operation.fromSymbol("/"));
    }

    @Test
    void testFromSymbolForUnsupportedOperation() {
        UnsupportedOperationException exception = assertThrows(UnsupportedOperationException.class, () ->
                Operation.fromSymbol("%")
        );

        assertEquals("Unsupported operation: %", exception.getMessage());
    }
}
