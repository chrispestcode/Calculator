package Handlers;

public class SubtractHandler implements OperationHandler {

    public SubtractHandler() {}

    @Override
    public Number executeOperation(Number num1, Number num2) throws Exception {

        String switchType = getSwitchType(num1,num2);

        switch (switchType) {
            case "Integer_Integer":
                return subtractIntegers((Integer) num1, (Integer) num2);
            case "Long_Long":
                return subtractLongs((Long) num1, (Long) num2);
            case "Long_Integer", "Integer_Long":
                return subtractLongs(num1.longValue(), num2.longValue());
            case "Double_Double", "Double_Float", "Float_Double":
                return subtractDoubles((Double) num1, (Double) num2);
            case "Float_Float":
                return subtractFloats((Float) num1, (Float) num2);
            case "Double_Long", "Long_Double":
                return subtractDoubles(num1.doubleValue(), num2.doubleValue());
            default:
                throw new UnsupportedOperationException("Unsupported numeric types: " +
                        num1.getClass().getName() + " and " + num2.getClass().getName());
        }
    }

    private String getSwitchType(Number num1, Number num2) {
        return num1.getClass().getSimpleName() + "_" + num2.getClass().getSimpleName();
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

