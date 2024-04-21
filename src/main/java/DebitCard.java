
public class DebitCard extends BankCard{

    public DebitCard() {
        super();
    }
    public DebitCard(int balance) {
        super(balance);

    }
    public void add(int sum) {
        balance += sum;
        System.out.println("После пополнения карты на " + sum + ":\n" + infoAboutBalance() + "\n");
        accrueBonuses(sum);
    }
    public boolean pay(int sum) {
        if((balance - sum) < 0) {
            System.out.println("Недостаточно средств");
            return false;
        } else {
            balance -= sum;
            System.out.println("\nПосле оплаты на " + sum + ":\n" + infoAboutBalance() + "\n");
            accrueBonuses(sum);
            return true;
        }
    }


}
