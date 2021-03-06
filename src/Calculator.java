/*
This is an simple Calculator that is used to do math.
It was created by Correy in December 2020.
*/
public class Calculator {

    // constructor
    public Calculator() {

    }

    // add method
    public int add(int a, int b) {
        int sum = a + b;
        System.out.printf("%d + %d = ", a, b);
        return sum;
    }

    // subtract method
    public int subtract(int a, int b) {
        int difference = a - b;
        System.out.printf("%d - %d = ", a, b);
        return difference;
    }

    // multiply method
    public int multiply(int a, int b) {
        int product = a * b;
        System.out.printf("%d x %d = ", a, b);
        return product;
    }

    // divide method
    public int divide(int a, int b) {
        int quotient = a / b;
        System.out.printf("%d / %d = ", a, b);
        return quotient;
    }

    // modulo method
    public int modulo(int a, int b) {
        int remainder = a % b;
        System.out.printf("%d mod %d = ", a, b);
        return remainder;
    }

    // main method
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();

        System.out.println(myCalculator.add(5, 7));
        System.out.println(myCalculator.subtract(45, 11));
        System.out.println(myCalculator.multiply(9, 3));
        System.out.println(myCalculator.divide(32, 8));
        System.out.println(myCalculator.modulo(32, 8));

    }




}
