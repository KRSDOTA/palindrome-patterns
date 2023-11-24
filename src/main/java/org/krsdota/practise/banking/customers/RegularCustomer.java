package org.krsdota.practise.banking.customers;

import org.krsdota.practise.banking.accounts.AccountManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RegularCustomer implements Customer {

    final Logger logger = LoggerFactory.getLogger(RegularCustomer.class);

    private AccountManager accountManager;


    @Override
    public void performDailyOperations() {

    }
}
