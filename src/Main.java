public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(15000);
        try {
            while (true) {
                account.withdraw(6000);
                System.out.println("Successfully withdrew 6000 som. Remaining balance: " + account.getAmount());
            }
        } catch (LimitException e) {
            System.out.println("Could not withdraw 6000 som. Remaining balance: " + e.getRemainingAmount());
        }
    }
}