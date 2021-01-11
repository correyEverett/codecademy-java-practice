// Import statement:
import java.util.ArrayList;

class PrimeDirective {

    // isPrime();
    public boolean isPrime(int number) {

        if(number == 2) {
            System.out.println(number + " is the smallest prime number!");
            return true;
        } else if(number < 2) {
            System.out.println(number + " is less than 2, therefore it is not a prime number!");
            return false;
        }

        for(int i = 2; i < number; i++) {
            if(number % i == 0) {
                System.out.println(number + " is not a prime number!");
                return false;
            }
        }

        System.out.println(number + " is a prime number!");
        return true;
    }


}