public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount += sum;
        System.out.println("ВЫ внесли счет" + sum);
    }

    public void withDraw(int sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Ошибка: У вас на считу не достаточно средств для запрашивоемой суммы " +
                    "\nУ вас на считу:" + '0', amount);
        }
        amount -= sum;
        System.out.println("ВЫ сняли " + sum);
    }
}
