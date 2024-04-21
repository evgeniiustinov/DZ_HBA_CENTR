public class Main {
    public static void main(String[] args) {
        BankCard test1 = new CreditCard(new DebitCard(1000), 10000);
        System.out.println(test1.infoAboutBalance());
        test1.setBonusPointProgramm(true);
        test1.setCashBackProgramm(true);
        test1.setSavingsProgramm(false);
        test1.add(50000);
        test1.pay(35000);
        System.out.println(test1.infoAboutAvailableFunds());







    }
}
