package org.krsdota.practise.banking.customers;

import org.krsdota.practise.banking.accounts.AccountManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PoorCustomer implements Customer {

    final Logger logger = LoggerFactory.getLogger(PoorCustomer.class);

    private AccountManager accountManager;

    @Override
    public void performDailyOperations() {

    }
}
