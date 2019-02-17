package by.bntu.fitr.isit.javalabs.lab1.pattern.comand;

public class Calculator {

    private CalculatorCommand calculatorCommand;

    public void setCalculatorCommand(CalculatorCommand calculatorCommand) {
        this.calculatorCommand = calculatorCommand;
    }

    public double calculate(double a, double b) {
        return calculatorCommand.execute(a, b);
    }

}
