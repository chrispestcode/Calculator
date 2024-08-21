package Calculator;

import Handlers.OperationHandler;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

public class Calculator {

    public static void main(String args[]) {

        Scanner reader = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Enter first number: ");
        String num1  = reader.next();
        System.out.println("Number: \t\t\t\t\t\t\t: " + num1);

        while (true) {
            System.out.println("Enter operation: ");
            String op = reader.next();
            System.out.println("Calculator.Operation: \t\t\t\t\t\t\t: " + op);

            System.out.println("Enter next number: ");
            String num2 = reader.next();
            System.out.println("Number: \t\t\t\t\t\t\t: " + num2);

                Number result = calculator.calculate(op, num1, num2);
                if (result == null) {
                    System.out.println("Exiting...");
                    System.exit(-1);
                }
                System.out.println("_____________________________________________________________________");
                System.out.println("Result: \t\t\t\t\t\t\t: " + result);
                num1 = result.toString();
        }

    }

    public Number calculate(String opStr, String str1, String str2) {
        try {
            Number num1 = NumberFormat.getInstance().parse(str1);
            Number num2 = NumberFormat.getInstance().parse(str2);
            Operation op = Operation.fromSymbol(opStr);

            return calculate(op, num1, num2);
        } catch (ParseException e) {
            System.out.println("Error encountered while parsing inputs : \n Provide input as : <number1> <operation> <number2> " +
                    "\n Example: 1 + 2");
        } catch (Exception e) {
            System.out.println("Error encountered during calculating result");
        }
        return null;
    }

    private Number calculate(Operation op, Number num1, Number num2) throws Exception {
        OperationHandler handler = new OperationExecutor().getOperationHandler(op);
        return handler.executeOperation(num1, num2);
    }

    /**
     * *
     * @param op list of operations to perform
     * @param nums list of numbers to perform operations on
     * @throws Exception e NotYetImplemented
     */
    private Number calculate(List<Operation> op, List<Number> nums) throws Exception {
       throw new Exception("Not yet implemented.");
    }
}
