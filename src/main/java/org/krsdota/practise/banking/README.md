
# Banking App Specification 

## Taken from https://coderanch.com/t/627551/engineering/OO-design-Banking

1) A bank can have any number of customers, and each customer can have multiple current and savings accounts.
2) Current account: The customer can open or close a checking account. He can deposit or withdraw money. The account balance cannot be negative. If a customer tries to withdraw more than he has in his account, the transaction will be declined
3) Savings: The customer can open or close a savings account. The minimum balance in the account should be $100. This account accrues interest at 5% compounded daily.
4) Opening an account: The customer will need to provide some personal details, and have a minimum balance of $100 to open either account.
5) Closing an account: The customer can close his account at any time. The money has he has in the account at that point will be returned to him. An account once closed can never be reopened.