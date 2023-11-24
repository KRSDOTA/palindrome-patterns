package org.krsdota.practise.banking.accounts;

public interface Account {

    /**
     * Add funds to the account
     *
     * @param amountToAdd The amount to add to the account
     */
    void addFunds(double amountToAdd);

    /**
     * Withdraw funds from the account
     *
     * @return withdrawn funds
     */
    double withdrawFunds(double amountToWithdraw);

    /**
     * if no value specified withdraw all funds from the account
     *
     * @return entire funds within account
     */
    double withdrawAllFunds();

    /**
     * Apply compounding interest based on the account value and interest percentage
     */
    void applyCompoundingInterest();

    /**
     * Check the balance of the account
     * @return the amount in the account
     */
    double checkBalance();

}
