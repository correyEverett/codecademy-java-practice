public class CarLoan {
    public static void main(String[] args) {

        int carLoan = 12500;
        int loanLength = 3;
        int interestRate = 3;
        int downPayment = 2499;

        if(loanLength <= 0 || interestRate <=0) {
            System.out.println("Error! You must take out a valid car loan.");
        } else if(downPayment >= carLoan) {
            System.out.println("The car can be paid in full.");
        } else {
            int remainingBalance = carLoan - downPayment;
            int months = loanLength * 12;
            int monthlyBalance = remainingBalance / months;
            System.out.println("Your monthly balance without interest is: $" + monthlyBalance);
            int interest = monthlyBalance * interestRate / 100;
            System.out.println("Your monthly interest is: $" + interest);
            int monthlyPayment = monthlyBalance + interest;
            System.out.println();
            System.out.println("Your monthly payment is: $" + monthlyPayment);
        }
    }
}
