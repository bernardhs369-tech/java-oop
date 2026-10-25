public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(221, "Bernardo");

        account.deposit(2000);

        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Account holder: " + account.getAccountHolder());
        System.out.println("Balance: " + account.getBalance());

        account.withdraw(500);
        System.out.println("New balance: " + account.getBalance());
    }
}
