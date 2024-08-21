package Handlers;

public class DivideHandler implements OperationHandler {

    public DivideHandler() {}

    @Override
    public Number executeOperation(Number num1, Number num2) throws Exception {

        String switchType = getSwitchType(num1,num2);

        switch (switchType) {
            case "Integer_Integer":
                return divideIntegers((Integer) num1, (Integer) num2);
            case "Long_Long":
                return divideLongs((Long) num1, (Long) num2);
            case "Long_Integer", "Integer_Long":
                return divideLongs(num1.longValue(), num2.longValue());
            case "Double_Double", "Double_Float", "Float_Double":
                return divideDoubles((Double) num1, (Double) num2);
            case "Float_Float":
                return divideFloats((Float) num1, (Float) num2);
            case "Double_Long", "Long_Double":
                return divideDoubles(num1.doubleValue(), num2.doubleValue());
            default:
                throw new UnsupportedOperationException("Unsupported numeric types: " +
                        num1.getClass().getName() + " and " + num2.getClass().getName());
        }
    }

    private String getSwitchType(Number num1, Number num2) {
        return num1.getClass().getSimpleName() + "_" + num2.getClass().getSimpleName();
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

