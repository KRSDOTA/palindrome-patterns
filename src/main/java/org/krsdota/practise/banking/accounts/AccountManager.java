package org.krsdota.practise.banking.accounts;


import java.util.List;

/**
 * Simple class responsible for holding user accounts and managing requests to accounts on  behalf of a customer
 */
public interface AccountManager {

    /**
     * Method to open an account (we'll tie this to the physical invocation of the object
     * @param openingBalance Starting balance of the account
     */
    void open(double openingBalance, AccountType accountType);

    /**
     * pass in the reference account object to close up the account,
     * returning the amount to the user and removing the instance from the held list of accounts
     *
     * @param account account to be closed
     * @return closing balance
     */
    double close(Account account);

    /**
     * Get all teh current accounts for a user
     * @return all accounts user holds
     */
    List<Account> getAccounts();

}
