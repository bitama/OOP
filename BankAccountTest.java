public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount B = new BankAccount();
        System.out.println(B.getAccountNumber());
        System.out.println(B.getCheckingBalance());
        B.setCheckingBalance(2000);
        System.out.println(B.getCheckingBalance());
        B.setSavingBalance(1000);
        B.setSavingBalance(1000);
        System.out.println(B.getSavingBalance());
        System.out.println(B.getTotalAmountOfMoney());
        B.withdrawChecking(500);
        System.out.println(B.getCheckingBalance());
        System.out.println(B.getSavingBalance());
        B.withdrawSaving(1200);
        System.out.println(B.getSavingBalance());
        System.out.println(B.getCheckingBalance());
        System.out.println(B.getTotalAmountOfMoney());

    }
}
    
