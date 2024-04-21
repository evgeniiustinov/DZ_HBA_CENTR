public class CreditCard extends BankCard{
    protected DebitCard debitCard;

    public CreditCard(DebitCard debitCard) {
        super(debitCard.getBalance());
        this.debitCard = debitCard;
    }
    public CreditCard(DebitCard debitCard, int creditLimit) {
        super(debitCard.getBalance(), creditLimit);
        this.debitCard = debitCard;
    }
    public void add(int sum) {
        int firstSum = sum;
        if(creditLimit == balanceOfCreditLimit) {
            balance += sum;
        } else if((creditLimit - balanceOfCreditLimit) == sum) {
            balanceOfCreditLimit += sum;
        } else {
            int debt = creditLimit - balanceOfCreditLimit;
            if(debt <= sum) {
                sum -= debt;
                balanceOfCreditLimit = creditLimit;
                balance += sum;
            } else {
                balanceOfCreditLimit += sum;
            }

        }
        System.out.println("\nПосле пополнения карты на " + firstSum + ":\n" + infoAboutAvailableFunds());
        accrueBonuses(firstSum);

    }
    public boolean pay(int sum) {
        int firstSum = sum;
        if((balance - sum) >= 0) {
            balance -= sum;
            System.out.println("\nПосле оплаты на " + firstSum + ":\n" + infoAboutAvailableFunds());
            accrueBonuses(firstSum);
            return true;
        } else if ((balance + balanceOfCreditLimit) < sum) {
            System.out.println("Недостаточно средств");
            return false;
        } else {
            sum -= balance;
            balance = 0;
            balanceOfCreditLimit -= sum;
            System.out.println("\nПосле оплаты на " + firstSum + ":\n" + infoAboutAvailableFunds());
            accrueBonuses(firstSum);
            return true;
        }
    }
}
