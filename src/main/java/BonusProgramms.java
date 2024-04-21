public abstract class BonusProgramms {
    protected int bonusPoints;
    protected int cashback;
    protected int accumulation;

    public BonusProgramms() {
        this.bonusPoints = 0;
        this.cashback = 0;
        this.accumulation = 0;
    }

    public int getBonusPoints() {
        return bonusPoints;
    }

    public int getCashback() {
        return cashback;
    }

    public int getAccumulation() {
        return accumulation;
    }
    public void setBonusPoints(int bonusPoints) {
        this.bonusPoints = bonusPoints;
    }

    public void setCashback(int cashback) {
        this.cashback = cashback;
    }

    public void setAccumulation(int accumulation) {
        this.accumulation = accumulation;
    }

    public abstract void calculate(int sum);

    @Override
    public abstract String toString();
}

