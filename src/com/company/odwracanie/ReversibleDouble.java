package com.company.odwracanie;

public class ReversibleDouble implements Reversible {
    private double number;

    public ReversibleDouble(double number) {
        this.number = number;
    }

    @Override
    public void reverse() {
        number = 1 / number;
    }

    @Override
    public String toString() {
        return Double.toString(number);
    }

    public void doSomething(){
        number+=10;
    }
}
