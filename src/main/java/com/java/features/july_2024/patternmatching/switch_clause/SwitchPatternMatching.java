package com.java.features.july_2024.patternmatching.switch_clause;

public class SwitchPatternMatching {

    static class Account {
        double getBalance() {
            return 0;
        }
    }

    static class SavingsAccount extends Account {
        double getSavings() {
            return 100;
        }
    }

    static class TermAccount extends Account {
        double getTermAccount() {
            return 1000;
        }
    }

    static class CurrentAccount extends Account {
        double getCurrentAccount() {
            return 10000;
        }
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        TermAccount ta = new TermAccount();
        CurrentAccount ca = new CurrentAccount();

        System.out.println("Before :: " + getBalanceWithoutSwitchPattern(sa) + " | After :: " + getBalanceWithSwitchPattern(sa));
        System.out.println("Before :: " + getBalanceWithoutSwitchPattern(ta) + " | After :: " + getBalanceWithSwitchPattern(ta));
        System.out.println("Before :: " + getBalanceWithoutSwitchPattern(ca) + " | After :: " + getBalanceWithSwitchPattern(ca));
    }

    static double getBalanceWithoutSwitchPattern(Account account) {
        double balance = 0;

        if (account instanceof SavingsAccount sa)
            balance = sa.getSavings();
        else if (account instanceof TermAccount ta)
            balance = ta.getTermAccount();
        else if (account instanceof CurrentAccount ca)
            balance = ca.getCurrentAccount();

        return balance;
    }

    static double getBalanceWithSwitchPattern(Account account) {
        double balance = 0;

        switch (account) { // Java 21 Feature
            case null -> throw new RuntimeException("Oops!!! Account is null");
            case SavingsAccount sa -> balance = sa.getSavings();
            case TermAccount ta -> balance = ta.getTermAccount();
            case CurrentAccount ca -> balance = ca.getCurrentAccount();
            default -> balance = account.getBalance();
        }

        return balance;
    }

}