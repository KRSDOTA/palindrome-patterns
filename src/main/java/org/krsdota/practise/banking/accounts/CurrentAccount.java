package org.krsdota.practise.banking.accounts;

public class CurrentAccount implements Account {

    double currentBalance;

    public CurrentAccount(double openingBalance) {
        this.currentBalance = openingBalance;
    }

    @Override
    public void addFunds() {

    }

    @Override
    public double withdrawFunds() {
        return 0;
    }

    @Override
    public void applyCompoundingInterest() {

    }
}
