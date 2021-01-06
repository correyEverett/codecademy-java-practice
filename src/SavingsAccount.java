public class SavingsAccount {

    double balance;

    public SavingsAccount(int initialBalance){
        balance = initialBalance;
    }

    public void checkBalance() {
        System.out.println("Hello!");
        System.out.println("Your balance is $" + balance);
    }

    public void deposit(double amountToDeposit) {
        balance = balance + amountToDeposit;
        System.out.println("You just deposited $" + amountToDeposit);
        System.out.println();
    }

    public double withdraw(double amountToWithdraw) {
        balance = balance - amountToWithdraw;
        System.out.println("You just withdrew $" + amountToWithdraw);
        System.out.println();
        return amountToWithdraw;
    }

    public static void main(String[] args){
        SavingsAccount savings = new SavingsAccount(2000);

        //Check balance:
        savings.checkBalance();

        //Withdrawing:
        savings.withdraw(300);

        //Check balance:
        savings.checkBalance();

        //Deposit:
        savings.deposit(600);

        //Check balance:
        savings.checkBalance();

        //Deposit:
        savings.deposit(600);

        //Check balance:
        savings.checkBalance();

        System.out.println("The process is complete. Sank U GOODBYE!");

    }

}
