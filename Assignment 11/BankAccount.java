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