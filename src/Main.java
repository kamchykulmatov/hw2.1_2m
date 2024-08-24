//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(15000.00);
        while (true) {
            try {
                account.withDraw(6000);
                System.out.println("Остаток " + account.getAmount());
            } catch (LimitException e) {
                try {
                    account.withDraw((int) account.getAmount());
                } catch (LimitException exception) {
                    throw new RuntimeException(exception);
                }
                System.out.println(e.getMessage());
                break;
            }
        }
    }
}