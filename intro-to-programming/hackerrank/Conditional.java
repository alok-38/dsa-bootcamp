
/*
 * Task
Given an integer,

, perform the following conditional actions:

    If n is odd, print Weird
    If n is even and in the inclusive range of to
, print Not Weird
    If n is even and in the inclusive range of to
, print Weird
   If n is even and greater than

    , print Not Weird
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Conditional {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();

        if (N % 2 == 0 && N >= 2 && N <= 5) {
            System.out.println("Not Weird");
        } else if (N % 2 == 0 && N > 20) {
            System.out.println("Not Weird");
        }

        else if (N % 2 == 0 && N >= 6 && N <= 20) {
            System.out.println("Weird");
        } else {
            System.out.println("Weird");
        }
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
    }
}