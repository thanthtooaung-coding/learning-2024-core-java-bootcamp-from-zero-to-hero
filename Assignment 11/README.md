# Problem Statement

Suppose that you are provided with a pre-written class BankAccount as described at right. (The headings are shown, but not the method bodies, to save space.) Assume that the fields, constructor, and methods shown are already implemented. You may refer to them or use them in solving this problem if necessary.

Write a method named transactionFee that will be placed inside the BankAccount class to become a part of each BankAccount object's behavior. The transactionFee method accepts a fee amount (a real number) as a parameter, and applies that fee to the user's past transactions. The fee is applied once for the first transaction, twice for the second transaction, three times for the third, and so on. These fees are subtracted out from the user's overall balance. If the user's balance is large enough to afford all of the fees with greater than $0.00 remaining, the method returns true. If the balance cannot afford all of the fees, the balance is left as 0.0 and the method returns false.

For example, given the following BankAccount object:

```java
BankAccount savings = new BankAccount("Jimmy");

savings.deposit(10.00);

savings.deposit(50.00);

savings.deposit(10.00);

savings.deposit(70.00);
```

The account at that point has a balance of $140.00.

If the following call were made: 

```java
savings.transactionFee(5.00);
```

Then the account would be deducted $5 + $10 + $15 + $20 for the four transactions, leaving a final balance of $90.00. The method would return true.

If a second call were made,

```java
savings.transactionFee(10.00);
```

Then the account would be deducted $10 + $20 + $30 + $40 for the four transactions, leaving a final balance of $0.00. The method would return false.

```java
// A BankAccount keeps track of a user's money balance and ID, and counts how many transactions deposits/withdrawals) are made.

public class BankAccount {

private String id;

private double balance;

private int transactions;

// Constructs a BankAccount

// object with the given id, and

// 0 balance and transactions. public BankAccount(String id)

// returns the field values

public double getBalance()

public String getID()

// Adds the amount to the balance

// if it is between 0-500.

// Also counts as 1 transaction.

public void deposit(double amount)

// Subtracts the amount from the balance if the user has enough money.

// Also counts as 1 transaction.

public void withdraw(double amount)

// your method would go here

}
```

---

## Solution Implementation

```java
public class BankAccount {

    private String id;
    private double balance;
    private int transactions;

    public BankAccount(String id) {
        this.id = id;
        this.balance = 0.0;
        this.transactions = 0;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getID() {
        return this.id;
    }

    public void deposit(double amount) {
        if (amount >= 0 && amount <= 500) {
            this.balance += amount;
            this.transactions++;
        }
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            this.transactions++;
        }
    }

    public boolean transactionFee(double fee) {
        double totalFee = 0.0;

        for (int i = 1; i <= this.transactions; i++) {
            totalFee += fee * i;
        }

        if (this.balance > totalFee) {
            this.balance -= totalFee;
            return true;
        } else {
            this.balance = 0.0;
            return false;
        }
    }

    public static void main(String[] args) {
        BankAccount savings = new BankAccount("Jimmy");

        savings.deposit(10.00);
        savings.deposit(50.00);
        savings.deposit(10.00);
        savings.deposit(70.00);

        System.out.println("Initial Balance: $" + savings.getBalance());

        boolean result1 = savings.transactionFee(5.00);
        System.out.println("After first transactionFee: $" + savings.getBalance());
        System.out.println("Transaction result: " + result1);

        boolean result2 = savings.transactionFee(10.00);
        System.out.println("After second transactionFee: $" + savings.getBalance());
        System.out.println("Transaction result: " + result2);
    }
}
```

## Output

```plaintext
Initial Balance: $140.0
After first transactionFee: $90.0
Transaction result: true
After second transactionFee: $0.0
Transaction result: false
```