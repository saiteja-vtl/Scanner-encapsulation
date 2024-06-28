
public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String account) {
        this.accountNumber = account;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String Name) {
        this.accountHolderName = Name;
    }

    public void setBalance(int amount) {
        this.balance = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println( "Balance after deposit of " + amount + " is " + balance);
    }


    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }
        System.out.println("Balance after withdrawal of " + amount + " is " + balance);
    }



    public static void main(String[] args) {
        BankAccount details=new BankAccount();
        details.setAccountNumber("1234568");
        details.setAccountHolderName("Tejas");
        details.setBalance(10000);


        System.out.println(details.getAccountNumber());
        System.out.println(details.getAccountHolderName());
        System.out.println("Initial Balance");
        System.out.println(details.getBalance());
        System.out.println();

        details.deposit(1000);
        details.withdraw(500);






    }
}
