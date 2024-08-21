public enum Operation {
    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    private final String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }

    public final String getSymbol() {
        return symbol;
    }

    public static final Operation fromSymbol(String symbol) {
        for (Operation operation : values()) {
            if (operation.getSymbol().equals(symbol)) {
                return operation;
            }
        }
        throw new UnsupportedOperationException("Unsupported operation: " + symbol);
    }
}
