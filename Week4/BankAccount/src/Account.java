public class Account {
    private String accnum;
    private String ownernum;
    private double balance;

    public Account(String accnum, String ownernum) {
        this(accnum, ownernum, 0.0);
    }

    public Account(String accnum, String ownernum, double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Opening balance cannot be negative");
        }

        this.accnum = accnum;
        this.ownernum = ownernum;
        this.balance = balance;
    }

    public boolean deposit(double amount) {
        if (amount <= 0) {
            return false;
        }

        balance += amount;
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            return false;
        }

        balance -= amount;
        return true;
    }

    public String getaccnum() {
        return accnum;
    }

    public String getownernum() {
        return ownernum;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account{accnum='" + accnum + "', ownernum='" + ownernum
                + "', balance=" + balance + "}";
    }
}
