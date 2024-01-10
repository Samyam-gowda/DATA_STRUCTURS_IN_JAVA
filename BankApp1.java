class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getbalance() {
        return balance;
    }

    public void withdraw(double amount) {
        System.out.println("withdraw: ");
        if (amount > this.balance) {
            System.out.println("Insufficient bank balance");
        } else {
            System.out.println("An amount of INR " + amount + " has been DEBITED to your account " + accountNumber);
            System.out.println("Total avail.bal INR " + (balance = balance - amount));
        }
        System.out.println();
    }

    public void deposit(double amount) {
        System.out.println("deposit: ");
        System.out.println("An amount of INR " + amount + " has been CREDITED to your account " + accountNumber);
        System.out.println("Total avail.bal INR " + (balance = balance + amount));
        System.out.println();
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void printAccountDetails(double year) {
        System.out.println("Savings Account: ");
        System.out.println("account holder name: " + getAccountHolderName());
        System.out.println("account number: " + getAccountNumber());
        System.out.println("total available balance: " + getbalance());
        System.out.println("interest earned after " + year + " years: " + getbalance() * year * interestRate);
        System.out.println();
    }
}

class CheckingAccount extends BankAccount {
    double overdraftLimit;

    CheckingAccount(String accountNumber, String accountHolderName, double balance, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void printAccountDetails(double amount) {
        System.out.println("Checking Account: ");
        System.out.println("account holder name: " + getAccountHolderName());
        System.out.println("account number: " + getAccountNumber());
        System.out.println("overdraft loan is: " + (amount - getbalance()));
    }
}

public class BankApp {
    public static void main(String args[]) {
        BankAccount obj1 = new BankAccount("XXXXXXX123", "Abhisheka poojary", 1000);
        obj1.withdraw(100);
        obj1.deposit(200);
        SavingsAccount obj2 = new SavingsAccount("XXXXXXX123", "Abhisheka poojary", obj1.getbalance(), 0.9);
        obj2.printAccountDetails(3);
        CheckingAccount obj3 = new CheckingAccount("XXXXXXX123", "Abhisheka poojary", obj2.getbalance(), 5000);
        obj3.printAccountDetails(10000);
    }
}
