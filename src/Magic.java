
// Write a small program that performs a mathematical magic trick! It will involve performing arithmetic operations on an integer that you choose.

public class Magic {
    public static void main(String[] args) {
        //Create an int variable called myNumber.
        // You can change this number to whatever integer you like less than 47000 and greater than -47000. The magic still works.
        int myNumber = 7;

        //Create an int variable called stepOne. Set it equal to the original   number (myNumber) multiplied by itself.
        int stepOne = myNumber * myNumber;
        //Create an int variable called stepTwo. Set it equal to the previous result (stepOne) plus the original number (myNumber).
        int stepTwo = stepOne + myNumber;
        // Create an int variable called stepThree. Set it equal to the previous result (stepTwo) divided by the original number.
        int stepThree = stepTwo / myNumber;
        // Create an int variable called stepFour. Set it equal to the previous result (stepThree) plus 17.
        int stepFour = stepThree + 17;
        // Create an int variable called stepFive. Set it equal to the previous result (stepFour) minus the original number.
        int stepFive = stepFour - myNumber;
    }
}
