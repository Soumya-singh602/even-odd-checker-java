import java.util.Scanner;

public class EvenOddChecker {

    public static void main(String[] args) {

        // Static value
        int staticNumber = 27;
        checkAndPrint(staticNumber);

        // User input
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter an integer: ");

        if (scanner.hasNextInt()) {
            int userNumber = scanner.nextInt();
            checkAndPrint(userNumber);
        } else {
            System.out.println("Error: Please enter a valid integer!");
        }

        scanner.close();
    }

    // Method to check even/odd
    private static void checkAndPrint(int number) {
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(number + " is " + result);
    }
}
