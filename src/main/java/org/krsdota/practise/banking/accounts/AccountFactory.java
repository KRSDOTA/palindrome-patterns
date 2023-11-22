package org.krsdota.practise.banking.accounts;


/**
 * Responsible for creating concrete account objects based on the provided type
 */
public class AccountFactory {

    public static Account makeAccount(double openingBalance, AccountType accountType){
        switch (accountType) {
            case CURRENT -> { return new CurrentAccount(openingBalance); }
            case SAVINGS -> { return new SavingAccount(openingBalance); }
            default -> throw new IllegalArgumentException("Invalid account type passed");
        }
    }

    private AccountFactory() {

    }
}
