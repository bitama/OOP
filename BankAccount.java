import java.util.*;

public class BankAccount {
    // private long accountNumber=(long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
    private long accountNumber;
    private int  checkingBalance;
    private double savingBalance;
    public static int numberOfCount = 0;
    public static int totalAmountOfMoney = 0;
    // private int min = 0;
    // private int max = 10;


    public BankAccount() {
        this.accountNumber = getRandomDigit();
        this.checkingBalance = 0;
        this.savingBalance = 0;
        this.numberOfCount++;

    }

    public double getTotalAmountOfMoney() {
        return this.totalAmountOfMoney;
    }

    public void setCheckingBalance(int amount) {
        this.checkingBalance += amount;
        totalAmountOfMoney += amount;
        System.out.println("CheckingBalance is " + this.checkingBalance);
    }
    public void setSavingBalance(int amount) {
        this.savingBalance += amount;
        totalAmountOfMoney += amount;
        System.out.println("SavingBalance is " + this.savingBalance);
    }

    public long getAccountNumber() {
        return this.accountNumber;
    }

    public int getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingBalance() {
        return this.savingBalance;
    }
    
    public long getRandomDigit() {
        long number = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
        return number;

    }

    public long setAccountNumber() {
        this.accountNumber = getRandomDigit();
        return this.accountNumber;
    }

    public void  withdrawChecking(int amount) {
        if (amount > this.checkingBalance) {
            System.out.println("you can not withdraw money");
        }
        else {
            this.checkingBalance -= amount;
            totalAmountOfMoney -= amount;
        }
    }
    public void withdrawSaving (int amount) {
        if (amount > this.savingBalance) {
            System.out.println("you can not withdraw money");
        }
        else {
            this.savingBalance -= amount;
            totalAmountOfMoney -= amount;
        }
    }
}

