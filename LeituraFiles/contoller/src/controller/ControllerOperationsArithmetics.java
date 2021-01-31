package controller;

import operations.arithmetic.*;

import java.util.HashMap;
import java.util.Map;

public class ControllerOperationsArithmetics {
    private final Map<String, Operacao> operations = new HashMap<>();

    public ControllerOperationsArithmetics() {
        operations.put("somar", new SumHelper());
        operations.put("subtrair", new SubHelper());
        operations.put("dividir", new DivHelper());
        operations.put("multiplicar", new MulHelper());
    }

    public int executeOperation(final String nameOperation, final int... values) {
        return operations.get(nameOperation).calculate(values);
    }
}
