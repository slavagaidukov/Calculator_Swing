package gui;

import models.Logic;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JButton b7;
    private JButton b8;
    private JButton b9;
    private JPanel jPanel;
    private JTextField textField;
    private JButton bDivide;
    private JButton b4;
    private JButton b5;
    private JButton b6;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b0;
    private JButton bDot;
    private JButton bMultiply;
    private JButton bMinus;
    private JButton bPlus;
    private JButton bDel;
    private JButton bEqual;
    Logic logic = new Logic();

    public Calculator() {
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField.getText().length() > 9) {
                } else if (textField.getText().equals("0")) {
                    textField.setText("7");
                } else {
                    textField.setText(textField.getText() + "7");
                }
            }

        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField.getText().length() > 9) {
                } else if (textField.getText().equals("0")) {
                    textField.setText("8");
                } else {
                    textField.setText(textField.getText() + "8");
                }
            }

        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField.getText().length() > 9) {
                } else if (textField.getText().equals("0")) {
                    textField.setText("9");
                } else {
                    textField.setText(textField.getText() + "9");
                }
            }

        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField.getText().length() > 9) {
                } else if (textField.getText().equals("0")) {
                    textField.setText("4");
                } else {
                    textField.setText(textField.getText() + "4");
                }
            }

        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField.getText().length() > 9) {
                } else if (textField.getText().equals("0")) {
                    textField.setText("5");
                } else {
                    textField.setText(textField.getText() + "5");
                }
            }

        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField.getText().length() > 9) {
                } else if (textField.getText().equals("0")) {
                    textField.setText("6");
                } else {
                    textField.setText(textField.getText() + "6");
                }
            }

        });
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField.getText().length() > 9) {
                } else if (textField.getText().equals("0")) {
                    textField.setText("1");
                } else {
                    textField.setText(textField.getText() + "1");
                }
            }

        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField.getText().length() > 9) {
                } else if (textField.getText().equals("0")) {
                    textField.setText("2");
                } else {
                    textField.setText(textField.getText() + "2");
                }
            }

        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField.getText().length() > 9) {
                } else if (textField.getText().equals("0")) {
                    textField.setText("3");
                } else {
                    textField.setText(textField.getText() + "3");
                }
            }

        });
        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField.getText().length() > 9) {
                } else if (textField.getText().equals(null) || textField.getText().equals("0")) {
                    textField.setText("0");
                } else {
                    textField.setText(textField.getText() + "0");
                }

            }
        });
        bDel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });
        bDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField.getText().contains(".")) {
                } else {
                    textField.setText(textField.getText() + ".");
                }
            }
        });
        bPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int oper = 1;
                logic.firstInput(textField);
                logic.setOperation(oper);
                textField.setText("");
            }
        });
        bEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double resReturn = logic.resultOutput(textField);
                if (resReturn%1==0) {
                    int whole = (int) resReturn;
                    textField.setText(Integer.toString(whole));
                    System.out.println(whole);
                }
                else {
                    textField.setText(Double.toString(resReturn));
                }
            }
        });
        bMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int oper = 2;
                logic.firstInput(textField);
                logic.setOperation(oper);
                textField.setText("");
            }
        });
        bMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int oper = 3;
                logic.firstInput(textField);
                logic.setOperation(oper);
                textField.setText("");
            }
        });
        bDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int oper = 4;
                logic.firstInput(textField);
                logic.setOperation(oper);
                textField.setText("");
            }
        });
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        JFrame jFrame = new JFrame("Calculator");
        jFrame.setContentPane(new Calculator().jPanel);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
