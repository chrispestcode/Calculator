package Handlers;

public class AddHandler implements OperationHandler {

    public AddHandler() {}

    @Override
    public Number executeOperation(Number num1, Number num2) throws Exception {

        String switchType = getSwitchType(num1,num2);

        switch (switchType) {
            case "Integer_Integer":
                return addIntegers((Integer) num1, (Integer) num2);
            case "Long_Long":
                return addLongs((Long) num1, (Long) num2);
            case "Long_Integer", "Integer_Long":
                return addLongs(num1.longValue(), num2.longValue());
            case "Double_Double", "Double_Float", "Float_Double":
                return addDoubles((Double) num1, (Double) num2);
            case "Float_Float":
                return addFloats((Float) num1, (Float) num2);
            case "Double_Long", "Long_Double":
                return addDoubles(num1.doubleValue(), num2.doubleValue());
            default:
                throw new UnsupportedOperationException("Unsupported numeric types: " +
                    num1.getClass().getName() + " and " + num2.getClass().getName());
        }
    }

    private String getSwitchType(Number num1, Number num2) {
        return num1.getClass().getSimpleName() + "_" + num2.getClass().getSimpleName();
    }


    private Integer addIntegers(int num1, int num2) {
        return Math.addExact(num1, num2);
    }

    private Long addLongs(long num1, long num2) {
        return Math.addExact(num1, num2);
    }

    private Double addDoubles(double num1, double num2) {
        double result = num1 + num2;
        if (Double.isInfinite(result)) {
            throw new ArithmeticException("Double overflow");
        }
        return result;
    }

    private Float addFloats(float num1, float num2) {
        float result = num1 + num2;
        if (Float.isInfinite(result)) {
            throw new ArithmeticException("Float overflow");
        }
        return result;
    }
}

