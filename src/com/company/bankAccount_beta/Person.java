package com.company.bankAccount_beta;

public class Person {
    private String name;

    Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
