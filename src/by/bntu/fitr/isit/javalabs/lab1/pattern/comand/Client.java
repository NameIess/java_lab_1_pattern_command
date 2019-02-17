package by.bntu.fitr.isit.javalabs.lab1.pattern.comand;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            Calculator calculator = new Calculator();

            System.out.println("press any key");
            String enteredValue = scanner.next();

            while (!enteredValue.equals("exit")) {

                System.out.println("Enter first value");
                double firstValue = scanner.nextDouble();

                System.out.println("Enter operation");
                String operation = scanner.next();

                System.out.println("Enter second value");
                double secondValue = scanner.nextDouble();

                CalculatorCommand command = CommandManager.getCommandByAction(operation);
                calculator.setCalculatorCommand(command);
                double result = calculator.calculate(firstValue, secondValue);
                System.out.println("result = " + result);

                System.out.println("Enter yes to continue");
                enteredValue = scanner.next();
            }
        }
    }
}
