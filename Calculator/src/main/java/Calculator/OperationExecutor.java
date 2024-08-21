package Calculator;

import Handlers.*;

import java.util.HashMap;
import java.util.Map;

public class OperationExecutor {

    private Map<Operation, OperationHandler> operationHandlers = new HashMap<>();
    public OperationExecutor() {
        this.operationHandlers.put(Operation.ADD, new AddHandler());
        this.operationHandlers.put(Operation.SUBTRACT, new SubtractHandler());
        this.operationHandlers.put(Operation.MULTIPLY, new MultiplyHandler());
        this.operationHandlers.put(Operation.DIVIDE, new DivideHandler());
    }


    public OperationHandler getOperationHandler(Operation op) {
        if(this.operationHandlers.containsKey(op)) {
            return this.operationHandlers.get(op);
        } else {
            StringBuilder errorMessage = new StringBuilder();
            errorMessage.append("The provided arithmetic Calculator.Operation is unsupported. " +
                    "Select an operation from the following: \n");
            for(Operation defaultOperation: Operation.values()) {
                errorMessage.append(defaultOperation.name() + "\n");
            }
            throw new UnsupportedOperationException(errorMessage.toString());
        }
    }
}

