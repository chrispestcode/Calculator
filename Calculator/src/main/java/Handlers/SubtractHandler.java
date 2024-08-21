package Handlers;

public class SubtractHandler implements OperationHandler {

    public SubtractHandler() {}

    @Override
    public Number executeOperation(Number num1, Number num2) throws Exception {
        if (num1 instanceof Integer && num2 instanceof Integer) {
            return subtractIntegers((Integer) num1, (Integer) num2);
        } else if (num1 instanceof Long && num2 instanceof Long) {
            return subtractLongs((Long) num1, (Long) num2);
        } else if (num1 instanceof Double && num2 instanceof Double) {
            return subtractDoubles((Double) num1, (Double) num2);
        } else if (num1 instanceof Float && num2 instanceof Float) {
            return subtractFloats((Float) num1, (Float) num2);
        } else {
            throw new UnsupportedOperationException("Unsupported numeric types: " +
                    num1.getClass().getName() + " and " + num2.getClass().getName());
        }
    }

    private Integer subtractIntegers(int num1, int num2) {
        return Math.subtractExact(num1, num2);
    }

    private Long subtractLongs(long num1, long num2) {
        return Math.subtractExact(num1, num2);
    }

    private Double subtractDoubles(double num1, double num2) {
        double result = num1 - num2;
        if (Double.isInfinite(result)) {
            throw new ArithmeticException("Double overflow");
        }
        return result;
    }

    private Float subtractFloats(float num1, float num2) {
        float result = num1 - num2;
        if (Float.isInfinite(result)) {
            throw new ArithmeticException("Float overflow");
        }
        return result;
    }
}

