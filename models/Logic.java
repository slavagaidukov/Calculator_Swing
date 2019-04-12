package models;

import javax.swing.*;

public class Logic {
    String firstNum, secondNum;
    double number1, number2, result;

    public int getOperation() {
        return operation;
    }

    public void setOperation(int operation) {
        this.operation = operation;
    }

    private int operation;

    public void firstInput(JTextField textField) {
        firstNum = textField.getText();
        number1 = Double.parseDouble(firstNum);
    }

    public double resultOutput(JTextField textField) {
        secondNum = textField.getText();
        number2 = Double.parseDouble(secondNum);
        switch (operation) {
            case 1:
                result = number1 + number2;
                break;
            case 2:
                result = number1 - number2;
                break;
            case 3:
                result = number1 * number2;
                break;
            case 4:
                result = number1 / number2;
                break;
        }
        return result;
    }
}
