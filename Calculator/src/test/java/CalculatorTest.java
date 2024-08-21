import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void testCalculate_AdditionOfIntegers() throws Exception {
        Number result = calculator.calculate("+", "7", "3");
        assertEquals(Long.valueOf(10), (long) result);
    }

    @Test
    public void testCalculate_SubtractionOfIntegers() throws Exception {
        Number result = calculator.calculate("-", "7", "3");
        assertEquals(Long.valueOf(4), (long) result);
    }

    @Test
    public void testCalculate_MultiplicationOfIntegers() throws Exception {
        Number result = calculator.calculate("*", "7", "3");
        assertEquals(Long.valueOf(21), (long) result);
    }

    @Test
    public void testCalculate_DivisionOfIntegers() throws Exception {
        Number result = calculator.calculate("/", "9", "3");
        assertEquals(Long.valueOf(3), (long) result);
    }
}
