package Handlers;

public class DivideHandler implements OperationHandler {

    public DivideHandler() {}

    @Override
    public Number executeOperation(Number num1, Number num2) throws Exception {
        if (num1 instanceof Integer && num2 instanceof Integer) {
            return divideIntegers((Integer) num1, (Integer) num2);
        } else if (num1 instanceof Long && num2 instanceof Long) {
            return divideLongs((Long) num1, (Long) num2);
        } else if (num1 instanceof Double && num2 instanceof Double) {
            return divideDoubles((Double) num1, (Double) num2);
        } else if (num1 instanceof Float && num2 instanceof Float) {
            return divideFloats((Float) num1, (Float) num2);
        } else {
            throw new UnsupportedOperationException("Unsupported numeric types: " +
                    num1.getClass().getName() + " and " + num2.getClass().getName());
        }
    }

    private Integer divideIntegers(int num1, int num2) {
        if(num2 == 0) {
            throw new ArithmeticException("Cannot divide by 0");
        }
        return Math.divideExact(num1, num2);
    }

    private Long divideLongs(long num1, long num2) {
        if(num2 == 0) {
            throw new ArithmeticException("Cannot divide by 0");
        }
        return Math.divideExact(num1, num2);
    }

    private Double divideDoubles(double num1, double num2) {
        if(num2 == 0) {
            throw new ArithmeticException("Cannot divide by 0");
        }
        double result = num1 / num2;
        if (Double.isInfinite(result)) {
            throw new ArithmeticException("Double overflow");
        }
        return result;
    }

    private Float divideFloats(float num1, float num2) {
        if(num2 == 0) {
            throw new ArithmeticException("Cannot divide by 0");
        }
        float result = num1 / num2;
        if (Float.isInfinite(result)) {
            throw new ArithmeticException("Float overflow");
        }
        return result;
    }
}

