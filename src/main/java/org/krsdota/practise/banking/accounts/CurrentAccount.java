package org.krsdota.practise.banking.accounts;

public class CurrentAccount implements Account {

    double currentBalance;

    public CurrentAccount(double openingBalance) {
        this.currentBalance = openingBalance;
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

    @Override
    public double checkBalance() {
        return 0;
    }
}
