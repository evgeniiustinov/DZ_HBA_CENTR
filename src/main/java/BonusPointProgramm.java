public class BonusPointProgramm extends BonusProgramms{
    private static final double PROCENT_OF_PURCHASES = 0.01;

    public BonusPointProgramm() {
        super();
    }

    @Override
    public void calculate(int sum) {
        bonusPoints += sum * PROCENT_OF_PURCHASES;
        System.out.println("Бонусные баллы: " + bonusPoints);
    }

    @Override
    public String toString() {
        return "Бонусные баллы: " + bonusPoints;
    }
}
