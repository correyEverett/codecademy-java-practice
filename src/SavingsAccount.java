public class SavingsAccount {

    int balance;

    public SavingsAccount(int initialBalance){
        balance = initialBalance;
    }

    public void checkBalance() {
        System.out.println("Hello!");
        System.out.println("Your balance is " + balance);
    }

    public void deposit(int amountToDeposit) {
        balance = balance + amountToDeposit;
        System.out.println("You just deposited " + amountToDeposit);

    }



}
