package org.calculator;

import org.calculator.controller.Controller;
import org.calculator.model.Model;
import org.calculator.view.View;

public class Main {
    public static void main(String[] args){
        Model model = new Model();
        View view = new View();
        new Controller(model ,view);
    }
}
