package com.company.odwracanie;

public class ReversibleString implements Reversible {
    private String str = "";

    ReversibleString(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return str;
    }

    @Override
    public void reverse() {
        StringBuilder stringBuilder = new StringBuilder(str);
        str = stringBuilder.reverse().toString();
    }

    public void doSomething() {
        str = "Tekst "+str;
    }
}
