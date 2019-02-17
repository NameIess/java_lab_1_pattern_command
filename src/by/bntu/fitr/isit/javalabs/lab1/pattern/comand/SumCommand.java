package by.bntu.fitr.isit.javalabs.lab1.pattern.comand;

public class SumCommand implements CalculatorCommand {

    @Override
    public double execute(double a, double b) {
        return a + b;
    }
}
