package com.company.bankAccount_beta;

public class BankCustomer {
    private Person person;
    private Account account;

    BankCustomer(Person person) {
        this.person = person;
        account = new Account();
    }

    public Account getAccount() {
        return this.account;
    }

    @Override
    public String toString() {
        return "Klient:" + person.toString() + " ma stan konta "+ account.getBalance();
    }
}
