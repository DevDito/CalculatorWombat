package com.satriaamrudito.calculator_java.interfaces;

import com.satriaamrudito.calculator_java.model.Operand;

public interface CalculatorActivity {
    void addOperand(Operand newOperand);
    void showOperandDialog();
    void clearHistory();
}
