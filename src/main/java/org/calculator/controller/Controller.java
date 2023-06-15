package org.calculator.controller;

import org.calculator.model.Model;
import org.calculator.view.View;

public class Controller {

    public Controller(Model model, View view){

        view.addAddButtonListener(e -> {
            int number = Integer.parseInt(view.getInput());
            model.add(number);
            view.setResult(model.getResult());
        });

        view.addSubtractButtonListener(e -> {
            int number = Integer.parseInt(view.getInput());
            model.subtract(number);
            view.setResult(model.getResult());
        });
    }
}
