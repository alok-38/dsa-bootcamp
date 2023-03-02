import java.util.Scanner;
import java.lang.Math;

public class AbsoluteValue {
    public static void main(String[] args) {
        // Define a Scanner Object for data input
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Java Absolute Value. Example 1");
        System.out.println("Please enter a number ");
        double number = inputNumber.nextDouble();
        // Use java.lang.Math.abs() to get absolute value of n
        double absoluteValue = Math.abs(number);
        System.out.println("Absolute value of " + inputNumber + " is " + absoluteValue);
        System.out.println("____________");
    }
}
