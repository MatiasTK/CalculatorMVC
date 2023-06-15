package org.calculator.model;

public class Model {
    private int result;

    public void add(int number){
        result += number;
    }

    public void subtract(int number){
        result -= number;
    }

    public int getResult() {
        return result;
    }
}
