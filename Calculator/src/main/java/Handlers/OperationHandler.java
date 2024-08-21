package Handlers;

public interface OperationHandler {
    public Number executeOperation(Number num1, Number num2) throws Exception;

    private String getSwitchType(Number num1, Number num2) {
        return num1.getClass().getSimpleName() + "_" + num2.getClass().getSimpleName();
    }
}
