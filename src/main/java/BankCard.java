import java.util.ArrayList;

public abstract class BankCard {
    protected int balance;
    protected int balanceOfCreditLimit;
    protected int creditLimit;
    protected BonusPointProgramm bonusPointProgramm;
    protected CashBackProgramm cashBackProgramm;
    protected SavingsProgramm savingsProgramm;
    protected boolean isBonusPointProgramm;
    protected boolean isCashBackProgramm;
    protected boolean isSavingsProgramm;

    public BankCard() {
        balance = 0;
        this.creditLimit = 0;
        this.balanceOfCreditLimit = 0;
    }
    public BankCard(int balance) {
        this.balance = balance;
    }
    public BankCard(int balance, int creditLimit) {
        this.balance = balance;
        this.creditLimit = creditLimit;
        this.balanceOfCreditLimit = creditLimit;
    }

    public int getBalance(){
        return balance;
    }
    public void setBalance(int balance) {
        this.balance += balance;
    }
    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }
    public abstract void add(int sum);

    public abstract boolean pay(int sum);

    public boolean getBonusPointProgramm() {
        return isBonusPointProgramm;
    }

    public void setBonusPointProgramm(boolean isBonusPointProgramm) {
        if(isBonusPointProgramm) {
            bonusPointProgramm = new BonusPointProgramm();
            this.isBonusPointProgramm = true;
        }

    }

    public boolean getCashBackProgramm() {
        return isCashBackProgramm;
    }

    public void setCashBackProgramm(boolean isCashBackProgramm) {
        if(isCashBackProgramm) {
            cashBackProgramm = new CashBackProgramm();
            this.isCashBackProgramm = true;
        }
    }

    public boolean getSavingsProgramm() {
        return isSavingsProgramm;
    }

    public void setSavingsProgramm(boolean isSavingsProgramm) {
        if(isSavingsProgramm) {
            savingsProgramm = new SavingsProgramm();
        }
    }
    protected void accrueBonuses(int sum) {
        if(isBonusPointProgramm) {
            bonusPointProgramm.calculate(sum);
        } else if (isCashBackProgramm) {
            cashBackProgramm.calculate(sum);
        } else if (isSavingsProgramm) {
            savingsProgramm.calculate(sum);
        }
    }

    public String infoAboutBalance(){
        return "Собственные средства: " + balance;
    }

    public String infoAboutAvailableFunds() {
        StringBuilder stringBuilder = new StringBuilder("");
        if(bonusPointProgramm != null) {
            stringBuilder.append(bonusPointProgramm + "\n");
        } else if (cashBackProgramm != null) {
            stringBuilder.append(cashBackProgramm + "\n");
        } else if (savingsProgramm != null) {
            stringBuilder.append(savingsProgramm + "\n");
        }
        return "Кредитная карта с лимитом: " + creditLimit + "\n" +
                "Кредитные средства: " + balanceOfCreditLimit + "\n" +
                infoAboutBalance() + "\n" + stringBuilder;
    }
}
