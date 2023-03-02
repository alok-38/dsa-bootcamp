import java.util.Scanner; // Import the Scanner class

class AcceptInput {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner myObject = new Scanner(System.in);
        System.out.println("Enter any number: ");
        // This method reads the number provided using keyboard
        myObject = scan.nextInt();
        // Closing Scanner after the use
        scan.close();
        // check if myObject is negative
        System.out.println(Math.abs(myObject));
    }
}