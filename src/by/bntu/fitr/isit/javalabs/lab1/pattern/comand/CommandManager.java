package by.bntu.fitr.isit.javalabs.lab1.pattern.comand;

import java.util.HashMap;
import java.util.Map;

public class CommandManager {

    private static final Map<String, CalculatorCommand> COMMAND_MAP = new HashMap<String, CalculatorCommand>() {
        {
            put("*", new MultiplyCommand());
            put("/", new DivisionCommand());
            put("-", new SubtractionCommand());
            put("+", new SumCommand());
        }
    };

    private CommandManager() {
    }

    public static CalculatorCommand getCommandByAction(String action) {
        return COMMAND_MAP.get(action);
    }

}
