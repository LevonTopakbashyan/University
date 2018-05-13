public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.setId(1);
        account.deposit(15);
        account.withdraw(5);

        System.out.println(account);
        System.out.printf("Account %d. Balance %.2f",account.getId(),account.getBalance());
    }
}
