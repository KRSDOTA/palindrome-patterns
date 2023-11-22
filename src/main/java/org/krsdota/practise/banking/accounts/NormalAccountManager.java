package org.krsdota.practise.banking.accounts;

import java.util.ArrayList;
import java.util.List;

public class NormalAccountManager implements AccountManager {

    private List<Account> accounts = new ArrayList<>();

    @Override
    public void open(double openingBalance, AccountType accountType) {
        accounts.add(AccountFactory.makeAccount(openingBalance, accountType));
    }

    @Override
    public double close(Account account) {
        return 0;
    }

    @Override
    public List<Account> getAccounts() {
        return null;
    }
}
