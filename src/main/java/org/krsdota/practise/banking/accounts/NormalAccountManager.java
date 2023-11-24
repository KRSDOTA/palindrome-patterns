package org.krsdota.practise.banking.accounts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

public class NormalAccountManager implements AccountManager {

    final Logger logger = LoggerFactory.getLogger(NormalAccountManager.class);

    private Set<Account> accounts = new HashSet<>();

    @Override
    public void open(double openingBalance, AccountType accountType) {
        accounts.add(AccountFactory.makeAccount(openingBalance, accountType));
    }

    @Override
    public double close(Account account) {
        final Account accountToClose = accounts.stream().filter(
                a -> a.equals(account)
        )
        .findFirst()
        .orElseThrow(
            () -> new IllegalArgumentException("can't find requested account to close")
        );

        final double fullContentsOfAccount = account.withdrawAllFunds();
        accounts.remove(accountToClose);
        return fullContentsOfAccount;
    }

    /**
     * Get the set of accounts under management
     * @return actively managed accounts
     */
    @Override
    public Set<Account> getAccounts() {
        return accounts;
    }
}
