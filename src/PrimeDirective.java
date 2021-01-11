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

    // onlyPrimes();
    public ArrayList<Integer> onlyPrimes(int[] numbers) {
        ArrayList<Integer> primes = new ArrayList<Integer>();

        for(int number : numbers) {
            if(isPrime(number) == true) {
                primes.add(number);
            }
        }

        System.out.println();
        System.out.println(primes);
        return primes;
    }

    // main();
    public static void main(String[] args) {
        PrimeDirective pd = new PrimeDirective();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

        //System.out.println(pd.isPrime(6));
        pd.onlyPrimes(numbers);
    }

}