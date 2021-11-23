package com.company.bankAccountBeta;

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
