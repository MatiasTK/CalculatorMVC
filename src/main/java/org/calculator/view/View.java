package org.calculator.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class View {
    private final JTextField inputField;
    private final JLabel resultLabel;
    private final JButton addButton;
    private final JButton subtractButton;

    public View() {
        JFrame frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,200);
        frame.setLayout(new FlowLayout());

        inputField = new JTextField(10);
        resultLabel = new JLabel("Resultado: ");

        addButton = new JButton("Sumar");
        subtractButton = new JButton("Restar");

        frame.add(inputField);
        frame.add(addButton);
        frame.add(subtractButton);
        frame.add(resultLabel);

        frame.setVisible(true);
    }

    public String getInput(){
        return inputField.getText();
    }

    public void setResult(int result){
        resultLabel.setText("Resultado: " + result);
    }

    public void addAddButtonListener(ActionListener listener){
        addButton.addActionListener(listener);
    }

    public void addSubtractButtonListener(ActionListener listener){
        subtractButton.addActionListener(listener);
    }
}
