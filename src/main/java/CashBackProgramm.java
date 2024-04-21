public class CashBackProgramm extends BonusProgramms{
    private static final int MIN_AMOUNT = 5_000;
    private static final double SIZE_OF_CASHBACK = 0.05;

    public CashBackProgramm() {
        super();
    }

    @Override
    public void calculate(int sum) {
        if(sum > MIN_AMOUNT) {
            cashback += sum * SIZE_OF_CASHBACK;
        }
        System.out.println("Cashback: " + cashback);
    }
    @Override
    public String toString() {
        return "Cashback: " + cashback;
    }
}
