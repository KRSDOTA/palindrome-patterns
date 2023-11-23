package org.krsdota.practise.banking.accounts;

public class SavingAccount implements Account {

    double currentBalance;

    public SavingAccount(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    @Override
    public void addFunds(double amountToAdd) {
    }

    @Override
    public double withdrawFunds(double amountToWithdraw) {
        return 0;
    }

    @Override
    public double withdrawAllFunds() {
        return 0;
    }

    @Override
    public void applyCompoundingInterest() {

    }
}
