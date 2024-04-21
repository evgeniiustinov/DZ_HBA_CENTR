public class SavingsProgramm extends BonusProgramms {

    private static final double PROCENT_SAVINGS = 0.005;

    public SavingsProgramm() {
        super();
    }

    @Override
    public void calculate(int sum) {
        accumulation += sum * PROCENT_SAVINGS;
        System.out.println("Накопления от суммы пополнения: " + accumulation);
    }
    @Override
    public String toString() {
        return "Накопления от суммы пополнения: " + accumulation;
    }
}
