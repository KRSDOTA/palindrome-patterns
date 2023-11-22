package org.krsdota.practise.banking.accounts;

public class SavingAccount implements Account {

    double currentBalance;

    public SavingAccount(double currentBalance) {
        this.currentBalance = currentBalance;
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
